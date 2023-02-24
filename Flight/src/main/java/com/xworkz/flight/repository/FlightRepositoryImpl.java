package com.xworkz.flight.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.flight.entity.FlightEntity;

@Repository
public class FlightRepositoryImpl implements FlightRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public FlightRepositoryImpl() {
		System.out.println("Running FlightRepositoryImpl");
	}

	@Override
	public boolean save(FlightEntity entity) {
		System.out.println("Running save");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		System.out.println("Save sucess " + entity);

		return true;
	}
	
	@Override
	public FlightEntity findBy(int id) {
		System.out.println("find by id in repo.." + id);
		EntityManager entitymanager = this.entityManagerFactory.createEntityManager();
		FlightEntity fe=entitymanager.find(FlightEntity.class,id);
		entitymanager.close();
		return fe;
		
	}

}
