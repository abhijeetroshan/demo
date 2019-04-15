package com.cg.trainee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

public class TraineeDaoImpl implements ITraineeDao {
	@PersistenceContext
	EntityManager em;
	
	//To Add data
	@Transactional
	@Override
	public void save(Trainee t) {
		em.persist(t);
	}

	
	//To Delete data
	@Override
	public Trainee delete(int id) {
		Trainee t = em.find(Trainee.class, id);
		em.remove(t);
		return t;
	}

	
	//To Update data
	@Override
	public Trainee update(Trainee t) {
		Trainee trainee = em.find(Trainee.class, t.getTraineeId());
		//trainee.setTraineeId(t.getTraineeId());
		trainee.setTraineeName(t.getTraineeName());
		trainee.setTraineeLocation(t.getTraineeLocation());
		trainee.setTraineeDomain(t.getTraineeDomain());
		return trainee;
	}
	
	//To Search data
		@Override
		public Trainee search(int id) {
			Trainee t = em.find(Trainee.class, id);
			return t;
		}
	
	//To get all trainee
	@Override
	public List<Trainee> getAll() {

		List<Trainee> listTrainee = em.createQuery("SELECT t FROM Trainee t").getResultList();

		if (listTrainee == null) {
			System.out.println("No Trainee found . ");
		} else {
			for (Trainee trainee : listTrainee) {
				System.out.println(trainee);
			}
		}

		return listTrainee;

	}

}
