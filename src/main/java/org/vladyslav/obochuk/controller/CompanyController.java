package org.vladyslav.obochuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vladyslav.obochuk.domain.Company;
import org.vladyslav.obochuk.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping(path = "/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getAllCompanies(){
        return companyService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Company getById(@PathVariable long id){
        return companyService.getById(id);
    }
}
