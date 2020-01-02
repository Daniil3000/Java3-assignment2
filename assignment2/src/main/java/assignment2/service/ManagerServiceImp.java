package assignment2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("manager")
public class ManagerServiceImp implements EmployeeService{

	public Integer calculateSalary() {
		Integer managerSalary = baseSalary*5;
		return managerSalary;
	}

}
