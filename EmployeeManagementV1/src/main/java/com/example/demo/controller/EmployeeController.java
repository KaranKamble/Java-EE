package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
		//Case : 1		Dependency Pooling
/*	@Autowired
	ApplicationContext ctx;
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee emp) {
		EmployeeService service = ( EmployeeService )ctx.getBean("employeeServiceImpl");
		service.addEmployee(emp);
		return emp.getName() + " added";
	}	*/
	
		//Case : 2		Dependency Injection(DI) using setter
/*	private EmployeeService service;
 * 
	@Autowired
	public void setEmployee( EmployeeService service ) {
		this.service = service;
	}
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee emp) {
		service.addEmployee(emp);
		return emp.getName() + " added";
	}	*/
	
		//Case : 3		DI using Constructor
	
	@Autowired
	private EmployeeService service;   //4. Field  injection
	
	public EmployeeController(EmployeeService service ) {
		this.service = service;
	}
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee emp) {
		service.addEmployee(emp);
		return emp.getName() + " added";
	}
	
	
	
}
