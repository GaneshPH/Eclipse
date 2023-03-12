package com.xworkz.Death_Info.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.Death_Info.entity.DeathInfoEntity;


@Repository
public class DeathInfoRepositoryImpl implements DeathInfoRepository{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	@Override
	public boolean save(DeathInfoEntity deathInfoEntity) {
		System.out.println("Running save method");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(deathInfoEntity);
		entityTransaction.commit();
		entityManager.close();
		return true;

	}
	
	
	@Override
	public DeathInfoEntity findBy(int id) {
		System.out.println("Running findBy");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		DeathInfoEntity DB = entityManager.find(DeathInfoEntity.class, id);
		entityManager.close();
		return DB;
	}
	
	@Override
	public List<DeathInfoEntity> findBy(String name) {
		System.out.println("Running findBy "+name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("set", name);
			List<DeathInfoEntity> list = query.getResultList();
			System.out.println("Total list: " + list.size());
			return list;
		} finally {
			manager.close();
		}

	}
	
	@Override
	public boolean update(DeathInfoEntity deathInfoEntity) {
		System.out.println("Running update");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.merge(deathInfoEntity);
			transaction.commit();
			return true;
		} finally {
			entityManager.close();
		}

	}
	
	@Override
	public boolean delete(int id) {
		System.out.println("Running delete");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		DeathInfoEntity del=entityManager.find(DeathInfoEntity.class, id);
		
		entityTransaction.begin();
		entityManager.remove(del);
		entityTransaction.commit();
		entityManager.close();

		return true;

	}

	
}
