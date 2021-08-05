package org.vladyslav.obochuk.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Objects;
import java.util.Set;

@Entity
@DiscriminatorValue("Employee")
public class Employee extends User {
    @Column(name = "title")
    private String title;

    @Column(name = "salary")
    private Integer salary;

    @ManyToMany(mappedBy = "employees", cascade = CascadeType.DETACH)
    private Set<Company> companies;

    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getTitle(), employee.getTitle()) && Objects.equals(getSalary(), employee.getSalary()) && Objects.equals(getCompanies(), employee.getCompanies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTitle(), getSalary());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + getId() + ", " +
                "title = " + getTitle() + ", " +
                "salary = " + getSalary() + ", " +
                "username = " + getUsername() + ", " +
                "firstName = " + getFirstName() + ", " +
                "lastName = " + getLastName() + ")";
    }
}
