package validation.com.xworkz.Soldier.service;

import validation.com.xworkz.Soldier.dto.SoldierDTO;

public interface SoldierService {
	boolean validateAndSave(SoldierDTO dto);
}
