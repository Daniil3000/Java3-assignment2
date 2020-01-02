package assignment2.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assignment2.model.Employee;
import assignment2.service.EmployeeService;

public class Application {
	public static void main(String[] args) {
		// creating annotation context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		// scanning beans
		context.scan("assignment2.model");
		context.scan("assignment2.service");
		context.refresh();
		
		// to see the salary of a clerk, we need to change the Qualifier for EmployeeService in Employee class
		Employee emp = context.getBean(Employee.class);
		emp.showSalary();
		
		context.close();
		
	}

}
