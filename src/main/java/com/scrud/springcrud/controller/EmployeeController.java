package com.scrud.springcrud.controller;

import com.scrud.springcrud.exception.ResourceNotFoundException;
import com.scrud.springcrud.model.Employee;
import com.scrud.springcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/getEmployees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for given id" + id));
        return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
        Employee updateEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for given id" + id));
        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());
        employeeRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {
        Employee deleteEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for given id" + id));
        employeeRepository.delete(deleteEmployee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
//GET
//http://localhost:8080/api/v1/getEmployees

//POST
//http://localhost:8080/api/v1/getEmployees
//{
//        "firstName": "N2",
//        "lastName": "N2",
//        "emailId": "nnnnnn@gmail.com"
//}

//GET by ID
//http://localhost:8080/api/v1/getEmployees/2

//PUT
//http://localhost:8080/api/v1/getEmployees/2
//{
//        "firstName": "N4",
//        "lastName": "N4",
//        "emailId": "N4N4N4N$@gmail.com"
//}

//DELETE
//http://localhost:8080/api/v1/getEmployees/2

//Credit
//https://www.youtube.com/watch?v=aCZmPgBHc88