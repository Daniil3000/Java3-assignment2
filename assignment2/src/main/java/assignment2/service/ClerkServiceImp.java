package assignment2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("clerk")
public class ClerkServiceImp implements EmployeeService{
	
	public Integer calculateSalary() {
		Integer clerkSalary = baseSalary*2;
		return clerkSalary;
	}
	

}
