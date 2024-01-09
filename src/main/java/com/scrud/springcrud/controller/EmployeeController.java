package com.scrud.springcrud.controller;

import com.scrud.springcrud.model.Employee;
import com.scrud.springcrud.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@ComponentScan("com.scrud")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
        Employee employee = employeeService.updateEmployee(id, employeeDetails);
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
//GET
//http://localhost:8080/api/v1/employee

//POST
//http://localhost:8080/api/v1/employee
//{
//        "firstName": "N2",
//        "lastName": "N2",
//        "emailId": "nnnnnn@gmail.com"
//}

//GET by ID
//http://localhost:8080/api/v1/employee/4

//PUT
//http://localhost:8080/api/v1/employee/2
//{
//        "firstName": "N4",
//        "lastName": "N4",
//        "emailId": "N4N4N4N$@gmail.com"
//}

//DELETE
//http://localhost:8080/api/v1/employee/2

//Credit
//https://www.youtube.com/watch?v=aCZmPgBHc88