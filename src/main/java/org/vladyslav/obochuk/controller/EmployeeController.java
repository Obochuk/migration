package org.vladyslav.obochuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vladyslav.obochuk.domain.Employee;
import org.vladyslav.obochuk.service.EmployeeService;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/{id}")
    public Employee getById(@PathVariable int id){
        return employeeService.getById(id);
    }
}
