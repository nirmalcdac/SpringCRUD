package com.scrud.springcrud.repository;

import com.scrud.springcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("")
    Optional<Object> findByIdOne(long id);
}
