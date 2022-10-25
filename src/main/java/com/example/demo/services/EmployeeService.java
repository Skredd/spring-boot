package com.example.demo.services;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
