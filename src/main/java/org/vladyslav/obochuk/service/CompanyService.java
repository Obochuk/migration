package org.vladyslav.obochuk.service;

import org.vladyslav.obochuk.domain.Company;

import java.util.List;

public interface CompanyService {
    Company getById(long id);

    List<Company> getAll();
}
