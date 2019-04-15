package com.cg.trainee;

import java.util.List;

public interface ITraineeDao {

	public void save(Trainee t);

	public Trainee delete(int id);
	
	public Trainee update(Trainee t);
	
	public Trainee search(int id);

	public List<Trainee> getAll();

}
