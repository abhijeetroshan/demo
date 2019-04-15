package com.cg.trainee;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;

public interface ITraineeService {

	public String addTrainee(@Valid Trainee t, BindingResult result);

	public Trainee deleteTrainee(int id);
	
	public Trainee updateTrainee(Trainee t);
	
	public Trainee searchTrainee(int id);

	public List<Trainee> getAllTrainee();
}
