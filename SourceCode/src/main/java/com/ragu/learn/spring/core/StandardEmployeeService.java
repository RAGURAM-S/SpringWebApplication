package com.ragu.learn.spring.core;

import org.springframework.stereotype.Service;

@Service

public class StandardEmployeeService implements EmployeeService {

	public Employee generateMail(Employee e) {

		System.out.println("Generation of MailId");

		String mailId = e.getFirstName() + "." + e.getLastName() + "@jda.com";
		e.setMailId(mailId);
		System.out.println(mailId);

		EmployeeDAO dao = new EmployeeDAO();
		return dao.generateEmpId(e);
	}
}
