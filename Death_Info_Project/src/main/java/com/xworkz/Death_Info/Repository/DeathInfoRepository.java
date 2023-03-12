package com.xworkz.Death_Info.Repository;

import java.util.List;

import com.xworkz.Death_Info.entity.DeathInfoEntity;

public interface DeathInfoRepository {
	boolean save(DeathInfoEntity deathInfoEntity);

	default DeathInfoEntity findBy(int id) {
		return null;
	}

	default List<DeathInfoEntity> findBy(String name) {
		return null;
	}

	boolean update(DeathInfoEntity deathInfoEntity);

	boolean delete(int id);

}
