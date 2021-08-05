package org.vladyslav.obochuk.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.vladyslav.obochuk.domain.Company;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@RunWith(SpringRunner.class)
class CompanyRepositoryTest {
    @Autowired
    private CompanyRepository companyRepository;

    @Test
    void databaseHasBeenInitialized() {
        List<Company> companies = companyRepository.findAll();

        assertEquals(3, companies.size());
    }

    @Test
    void shouldGetCompanyById() {
        Company company = companyRepository.getById(1L);

        assertEquals("EPAM", company.getName());
        assertEquals(new BigDecimal("6000.00"), company.getDebt());
        assertEquals(new BigDecimal("2000.00"), company.getIncome());
        assertTrue(company.getEmployees().isEmpty());
    }
}
