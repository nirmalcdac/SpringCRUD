package com.scrud.springcrud.repository;

import com.scrud.springcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
