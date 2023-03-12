package com.xworkz.Death_Info.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.Death_Info.Repository.DeathInfoRepository;
import com.xworkz.Death_Info.dto.DeathInfoDTO;
import com.xworkz.Death_Info.entity.DeathInfoEntity;

@Service
public class DeathInfoServiceImpl implements DeathInfoService {

	@Autowired
	private DeathInfoRepository deathInfoRepository;

	@Override
	public Set<ConstraintViolation<DeathInfoDTO>> validateAndSave(DeathInfoDTO deathInfoDTO) {
		System.out.println("Running validateAndSave Method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<DeathInfoDTO>> violation = validator.validate(deathInfoDTO);
		if (!violation.isEmpty() && violation != null) {
			System.out.println("Violation Occured");
			return violation;
		}
		System.out.println("No violation");
		DeathInfoEntity entity = new DeathInfoEntity();
		entity.setAge(deathInfoDTO.getAge());
		entity.setLocation(deathInfoDTO.getLocation());
		entity.setMarried(deathInfoDTO.getMarried());
		entity.setName(deathInfoDTO.getName());
		entity.setReasonOfDeath(deathInfoDTO.getReasonOfDeath());
		boolean saved = this.deathInfoRepository.save(entity);

		System.out.println("Saved: " + saved);
		return Collections.emptySet();

	}

	@Override
	public DeathInfoDTO findByID(int id) {
		System.out.println("Running FindByID");
		if (id > 0) {
			DeathInfoEntity entity = this.deathInfoRepository.findBy(id);
			if (entity != null) {
				System.out.println("Entity found:" + id);
				DeathInfoDTO deathInfoDTO = new DeathInfoDTO();

				deathInfoDTO.setAge(entity.getAge());
				deathInfoDTO.setId(entity.getId());
				deathInfoDTO.setLocation(entity.getLocation());
				deathInfoDTO.setMarried(entity.getMarried());
				deathInfoDTO.setName(entity.getName());
				deathInfoDTO.setReasonOfDeath(entity.getReasonOfDeath());
				return deathInfoDTO;
			}
		}
		return null;
	}

	@Override
	public List<DeathInfoDTO> findByName(String name) {
		System.out.println("Running findByName");
		if (name != null && !name.isEmpty()) {
			List<DeathInfoEntity> entities = this.deathInfoRepository.findBy(name);
			List<DeathInfoDTO> dtos = new ArrayList<DeathInfoDTO>();
			for (DeathInfoEntity deathInfoEntity : entities) {
				DeathInfoDTO deathInfoDTO = new DeathInfoDTO();

				deathInfoDTO.setAge(deathInfoEntity.getAge());
				deathInfoDTO.setId(deathInfoEntity.getId());
				deathInfoDTO.setLocation(deathInfoEntity.getLocation());
				deathInfoDTO.setMarried(deathInfoEntity.getMarried());
				deathInfoDTO.setName(deathInfoEntity.getName());
				deathInfoDTO.setReasonOfDeath(deathInfoEntity.getReasonOfDeath());

				dtos.add(deathInfoDTO);

			}
			System.out.println("Size of dtos:" + dtos.size());
			return dtos;
		} else {
			System.err.println("name is invalid");
			return null;
		}

	}

	@Override
	public Set<ConstraintViolation<DeathInfoDTO>> validateAndUpdate(DeathInfoDTO deathInfoDTO) {
		System.out.println("Running validateAndUpdate" + deathInfoDTO);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<DeathInfoDTO>> violation = validator.validate(deathInfoDTO);
		if (!violation.isEmpty()) {
			System.out.println("Violation found");
			return violation;

		} else {
			System.out.println("No violation");
			DeathInfoEntity entity = new DeathInfoEntity();

			entity.setAge(deathInfoDTO.getAge());
			entity.setId(deathInfoDTO.getId());
			entity.setLocation(deathInfoDTO.getLocation());
			entity.setMarried(deathInfoDTO.getMarried());
			entity.setName(deathInfoDTO.getName());
			entity.setReasonOfDeath(deathInfoDTO.getReasonOfDeath());

			this.deathInfoRepository.update(entity);
			return Collections.emptySet();
		}
	}

	@Override
	public boolean validateAnddelete(int id) {
		System.out.println("Running Validateanddelete");
		if (id < 0) {
			return false;
		} else {
			boolean deleted = this.deathInfoRepository.delete(id);
			System.out.println("Deleted: " + deleted);
			return deleted;

		}

	}
}
