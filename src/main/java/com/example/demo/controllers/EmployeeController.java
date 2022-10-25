package com.example.demo.controllers;

import com.example.demo.repository.entity.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping("")
    Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        return employeeService.createEmployee(employee);
    }

}