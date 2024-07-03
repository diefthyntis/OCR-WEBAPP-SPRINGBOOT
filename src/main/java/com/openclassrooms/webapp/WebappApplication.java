package com.openclassrooms.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassrooms.webapp.model.Employee;
import com.openclassrooms.webapp.repository.EmployeeProxy;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/*
@SpringBootApplication
public class WebappApplication implements CommandLineRunner {
	
	
	@Autowired	
	private CustomProperties props;

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ici sera affiché l'URL et son port pour appeler API:"+props.getApiUrl());
		
	}
	
	

}
*/



@SpringBootApplication
public class WebappApplication {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}
	
		
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeProxy ep = new EmployeeProxy();
		Iterable<Employee> it = ep.getEmployees();
				
		
		it.forEach(e -> System.out.println(e.getMail()));
		
				
	}

	

}
