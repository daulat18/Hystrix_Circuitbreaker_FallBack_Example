package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class Mycontroller {
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "getDataFallBack")
	public Employee getEmployee(){
		
		Employee emp = new Employee();
		emp.setFirstName("emp1");
		emp.setLastName("manager");
		emp.setMobile("1");
		emp.setRollNumber(300);
		
		Address address=new Address();
		address.setArea("pune");
		address.setLine1("Chinchwad");
		address.setPincode("123");
		emp.setAddress(address);
		
		if(emp.getFirstName().equalsIgnoreCase("emp1"))
			throw new RuntimeException();

		return emp;
		
	}
public Employee getDataFallBack() {
		
		Employee emp = new Employee();
		emp.setFirstName("fallback-emp1");
		emp.setLastName("fallback-manager");
		emp.setMobile("fallback-1");
		emp.setRollNumber(3000);
		Address address=new Address();
		address.setArea("pune");
		address.setLine1("Chinchwad");
		address.setPincode("123");
		emp.setAddress(address);
		return emp;
		
	}
}
