package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Ldetails;
import dto.Mdetails;

public class Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Mdetails c2) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(c2);
		entityTransaction.commit();

	}

	public void lDetails(Ldetails l1) {
		entityTransaction.begin();
		entityManager.persist(l1);
		entityTransaction.commit();
	}
	
	public List<Mdetails> fetchAll() {
		Query query=entityManager.createQuery("select data from Mdetails data");
		List<Mdetails> dtos =query.getResultList();
		return dtos;
	}
	
	public void update() {
		
	}

}
