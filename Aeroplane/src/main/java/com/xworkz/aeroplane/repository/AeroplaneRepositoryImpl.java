package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

@Repository
public class AeroplaneRepositoryImpl implements AeroplaneRepository{
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroplaneRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroplaneEntity entity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(entity);
		transaction.commit();
		em.close();
		return true;
	}
	@Override
		public AeroplaneEntity findBy(int id) {
		System.out.println("find by id in repo.." + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroplaneEntity ae=entityManager.find(AeroplaneEntity.class,id);
		entityManager.close();
		return ae;
		}

}
