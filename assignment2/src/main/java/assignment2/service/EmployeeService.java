package assignment2.service;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	Integer baseSalary = 2500;
	
	public Integer calculateSalary();

}
