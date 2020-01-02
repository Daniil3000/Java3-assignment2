package assignment2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import assignment2.service.EmployeeService;


@Component
public class Employee {
	
	public Employee() {
	}
	
	@Autowired
	@Qualifier("manager")
	EmployeeService employeeService;
	
	public void showSalary() {
		System.out.println("This employee salary is " + employeeService.calculateSalary());
	}

}
