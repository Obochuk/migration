package org.vladyslav.obochuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vladyslav.obochuk.domain.Employee;
import org.vladyslav.obochuk.repository.EmployeeRepository;
import org.vladyslav.obochuk.service.EmployeeService;

import java.util.NoSuchElementException;

@Service
public class DefaultEmployeeService implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public DefaultEmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
