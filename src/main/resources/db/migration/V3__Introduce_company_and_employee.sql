CREATE TABLE  company (
  id BIGINT AUTO_INCREMENT NOT NULL,
  name VARCHAR(255) NULL,
  debt DECIMAL(19, 2) NULL,
  income DECIMAL(19, 2) NULL,
  CONSTRAINT pk_company PRIMARY KEY (id)
);

CREATE TABLE company_employee (
  company_id BIGINT NOT NULL,
  employee_id INT NOT NULL,
  CONSTRAINT pk_company_employee PRIMARY KEY (company_id, employee_id)
);

ALTER TABLE test_user ADD salary INT NULL;
ALTER TABLE test_user ADD title VARCHAR(255) NULL;
ALTER TABLE test_user ADD type VARCHAR(31) NULL;

UPDATE test_user SET type = 'User' WHERE type is null;

ALTER TABLE company_employee ADD CONSTRAINT fk_comemp_on_company FOREIGN KEY (company_id) REFERENCES company (id);
ALTER TABLE company_employee ADD CONSTRAINT fk_comemp_on_employee FOREIGN KEY (employee_id) REFERENCES test_user (id);