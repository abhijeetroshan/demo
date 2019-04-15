package com.cg.trainee;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TraineeController {

	@Autowired
	TraineeServiceImpl traineeService;

	// LOGIN PAGE
	@RequestMapping(method = RequestMethod.GET, path = "/getPage")
	public String loginPage(@ModelAttribute("t") @Valid Trainee t) {
		return "login";
	}

	// WELCOME PAGE WITH ALL OPERATIONS
	@RequestMapping(method = RequestMethod.POST, path = "/authenticate")
	public String operationPage(@ModelAttribute("t") @Valid Trainee t) {
		return "authenticate";
	}

	// ADD NEW RECORD PAGE

	@RequestMapping(method = RequestMethod.GET, path = "/add")
	public String display(@ModelAttribute("t") @Valid Trainee t) {

		return "addRecordForm";
	}

	// @Transactional
	@RequestMapping(method = RequestMethod.POST, path = "/recordView")
	public ModelAndView newTrainee(@ModelAttribute("t") @Valid Trainee t, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		String name = traineeService.addTrainee(t, result);
		
		if (result.hasErrors()) {
			mv.setViewName("addRecordForm");
			return mv;
		}
		mv.addObject("key", t);
		mv.setViewName("authenticate");
		return mv;

	}

	// DELETE TRAINEE FORM
	@RequestMapping(method = RequestMethod.GET, path = "/delete")
	public String checkRegister(Trainee trainee, Model model) {
		model.addAttribute("Trainee", trainee);
		return "delete";
	}

	@Transactional
	@RequestMapping(method = RequestMethod.POST, path = "/delete")
	public ModelAndView deleteEmployee(@ModelAttribute @Valid Trainee t) {

		ModelAndView mv = new ModelAndView();

		Trainee success = traineeService.deleteTrainee(t.getTraineeId());
		List<Trainee> list = new ArrayList<Trainee>();
		list.add(success);
		mv.addObject("tlist", list);
		mv.addObject("trainee", new Trainee());
		mv.addObject("key", success);
		mv.setViewName("traineeInfo");
		return mv;
	}
	
	//UPDATE TRAINEE INFO
	@RequestMapping(method = RequestMethod.GET, path = "/update")
	public String checkUpdateRegister(Trainee trainee, Model model) {
		model.addAttribute("Trainee", trainee);
		return "update";
	}
	
	@Transactional
	@RequestMapping(method = RequestMethod.POST, path = "/searchUpdate")
	public ModelAndView searchEmployeeUpdate(@ModelAttribute @Valid Trainee t) {
		ModelAndView mv = new ModelAndView();
		Trainee success = traineeService.searchTrainee(t.getTraineeId());
		mv.addObject("id", success.getTraineeId());
		mv.addObject("name", success.getTraineeName());
		mv.addObject("location", success.getTraineeLocation());
		mv.addObject("domain", success.getTraineeDomain());
		mv.setViewName("update");
		return mv;
	}
	
	@Transactional
	@RequestMapping(method = RequestMethod.POST, path = "/update")
	public ModelAndView updateEmployee(@ModelAttribute @Valid Trainee t) {

		ModelAndView mv = new ModelAndView();

		Trainee success = traineeService.updateTrainee(t);
		List<Trainee> list = new ArrayList<Trainee>();
		list.add(success);
		mv.addObject("tlist", list);
		mv.addObject("trainee", new Trainee());
		mv.addObject("key", success);
		mv.setViewName("traineeInfo");
		return mv;
	}
	
	//RETRIEVE TRAINEE INFO
		@RequestMapping(method = RequestMethod.GET, path = "/retrieve")
		public String checkRetrieveRegister(Trainee trainee, Model model) {
			model.addAttribute("Trainee", trainee);
			return "retrieve";
		}
		
		@Transactional
		@RequestMapping(method = RequestMethod.POST, path = "/retrieve")
		public ModelAndView searchEmployee(@ModelAttribute @Valid Trainee t) {

			ModelAndView mv = new ModelAndView();

			Trainee success = traineeService.searchTrainee(t.getTraineeId());
			List<Trainee> list = new ArrayList<Trainee>();
			list.add(success);
			mv.addObject("tlist", list);
			mv.addObject("trainee", new Trainee());
			mv.addObject("key", success);
			mv.setViewName("traineeInfo");
			return mv;
		}
	
	
	// GET ALL
	@RequestMapping(method = RequestMethod.GET, path = "/getAll")
	public ModelAndView getAllTranee(Trainee trainee, Model model) {
		ModelAndView mv = new ModelAndView();
		List<Trainee> list = traineeService.getAllTrainee();
		model.addAttribute("Trainee", trainee);

		mv.addObject("tlist", list);
		mv.addObject("trainee", new Trainee());
		// mv.addObject("key", list);
		mv.setViewName("traineeInfo");
		return mv;
	}
}
