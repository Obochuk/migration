Prerequisites:
1. Maven (I`m using 3.6.3 version)
2. Java 11 (SAP version, should work on any other)
3. MySQL 5.7 with 2 schemas: migration, migration_liquibase and user with all rights 'migration' 
`Database could be set up with docker (only one schema):
   docker-compose.yml

version: '3.1'

services:
db:
image: mysql:5.7
restart: always
environment:
MYSQL_DATABASE: 'migration'
MYSQL_USER: 'migration'
MYSQL_ROOT_PASSWORD: 'password'
ports:
- '3306:3306'

docker-compose up db`

to run application use next command:

1. For flyway migration: mvn spring-boot:run -Dspring-boot.run.profiles=flyway
2. For liquibase migration: mvn spring-boot:run -Dspring-boot.run.profiles=liquibase


Rest app can be accessed on port 8095 with next endpoints:

GET http://localhost:8095/companies/{id}

GET http://localhost:8095/companies

GET http://localhost:8095/users/{id}

GET http://localhost:8095/employees/{id}


