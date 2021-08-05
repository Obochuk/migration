package org.vladyslav.obochuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vladyslav.obochuk.domain.Company;
import org.vladyslav.obochuk.repository.CompanyRepository;
import org.vladyslav.obochuk.service.CompanyService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DefaultCompanyService implements CompanyService {
    private CompanyRepository companyRepository;

    @Autowired
    public DefaultCompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company getById(long id) {
        return companyRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }
}
