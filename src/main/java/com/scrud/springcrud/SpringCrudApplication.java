package com.scrud.springcrud;

import com.scrud.springcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Nalini");
//		employee.setLastName("Nalini");
//		employee.setEmailId("drnalininirmal@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Nalini1");
//		employee1.setLastName("Nalini1");
//		employee1.setEmailId("drnalininirmal1@gmail.com");
//		employeeRepository.save(employee1);
	}
}
