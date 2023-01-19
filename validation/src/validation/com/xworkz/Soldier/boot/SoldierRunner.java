package validation.com.xworkz.Soldier.boot;

import validation.com.xworkz.Soldier.dto.SoldierDTO;
import validation.com.xworkz.Soldier.repository.SoldierImpl;
import validation.com.xworkz.Soldier.service.SoldierServiceImpl;

public class SoldierRunner {
	public static void main(String[] args) {
		SoldierDTO soldierDto=new SoldierDTO("Ganesh", 10, "First", "India", "Byadgi");
		SoldierImpl soldierRepo=new SoldierImpl();
		SoldierServiceImpl service=new SoldierServiceImpl(soldierRepo);
		service.validateAndSave(soldierDto);
	}

}
