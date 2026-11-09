# Correspondances

Spring Boot application (Java 25) managing correspondences and stations, connected to a PostgreSQL database and using Flyway for schema migrations.

## Prerequisites

Before running the project, ensure you have installed:
- Java 25 (JDK)
- Maven (or use the included wrapper ./mvnw)
- PostgreSQL 18+

## Configuration

The main configuration file is located at src/main/resources/application.properties.

properties
spring.application.name=correspondances

# PostgreSQL Connection
spring.datasource.url=jdbc:postgresql://localhost:5432/correspondances
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD

# Flyway Migration
spring.flyway.enabled=true

# Hibernate / JPA
spring.jpa.hibernate.ddl-auto=validate

# Application Port
server.port=8081


## Spring Boot & Maven Commands

Run all commands from the project root in your terminal.

1. Run the application:
.\mvnw spring-boot:run

2. Build the project:
.\mvnw clean install

3. Run unit/integration tests:
.\mvnw test


## PostgreSQL & psql Commands

- Connect to the database:
& "C:\PostgreSQL\bin\psql.exe" -U postgres -d correspondances

- List tables:
\dt

- View station table structure:
\d station

- Display all stations:
SELECT * FROM station;

- Exit psql:
\q


## API Documentation (Swagger UI)

Once the application is running on port 8081, test the REST endpoints via the interactive Swagger interface:
- Swagger UI: http://localhost:8081/swagger-ui.html
- OpenAPI JSON: http://localhost:8081/v3/api-docs


## Team Roles & Organization

- Person 1 & 2: Entities, Services, Database configuration, and business logic.
- Person 3 (You): Controllers, REST endpoints, Swagger documentation, and API testing. Ensure that business logic is delegated to services rather than kept inside controllers.
