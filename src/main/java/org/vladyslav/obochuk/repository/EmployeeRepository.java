package org.vladyslav.obochuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vladyslav.obochuk.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
