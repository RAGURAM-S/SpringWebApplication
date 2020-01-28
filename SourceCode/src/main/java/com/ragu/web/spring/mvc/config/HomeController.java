package com.ragu.web.spring.mvc.config;

import com.ragu.learn.spring.core.*;


import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/home")
	String homePage() {
		System.out.println("Display HomePage");
		return "Welcome";
	}
	
	@RequestMapping("/createEmployee")
	String createEmployee(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("HomeController.createEmployee()");
//		System.out.println("Display Employee Creation Page");
//		System.out.println(firstName + " " + lastName);
		
		Employee emp = new Employee(request.getParameter("firstName"), request.getParameter("lastName"));
//		EmployeeService service = new SpecialEmployeeService();
		service.generateMail(emp);
		System.out.println(emp);

		request.setAttribute("empId", emp.getId());
		request.setAttribute("empName", emp.getFirstName() + " " + emp.getLastName());
		request.setAttribute("empMailID", emp.getMailId());
		return "CreateEmployee";
}
}
