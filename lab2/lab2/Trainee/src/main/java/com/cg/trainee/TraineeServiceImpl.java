package com.cg.trainee;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;

public class TraineeServiceImpl implements ITraineeService {

	ITraineeDao traineeDao;

	// SERVICE METHOD TO ADD (BUSINESS LOGIC)
	@Override
	public String addTrainee(@Valid Trainee t, BindingResult result) {
		if (result.hasErrors()) {
			return "ERROR";
		}
		traineeDao.save(t);
		return "SUCCESS";
	}

	// SERVICE METHOD TO DELETE (BUSINESS LOGIC)
	@Override
	public Trainee deleteTrainee(int id) {
		if (id == 0) {
			return null;
		}
		Trainee tr = traineeDao.delete(id);
		return tr;
	}
	
	// SERVICE METHOD TO UPDATE (BUSINESS LOGIC)
		@Override
		public Trainee updateTrainee(Trainee t) {
			if (t == null) {
				return null;
			}
			Trainee tr = traineeDao.update(t);
			return tr;
		}

	
	// SERVICE METHOD TO RETRIEVE (BUSINESS LOGIC)
		@Override
		public Trainee searchTrainee(int id) {
			if (id == 0) {
				return null;
			}
			Trainee tr = traineeDao.search(id);
			return tr;
		}
	
	
	// SERVICE METHOD TO RETRIEVE ALL (BUSINESS LOGIC)
	@Override
	public List<Trainee> getAllTrainee() {
		return traineeDao.getAll();
	}

	// gs
	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}

	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}



}
