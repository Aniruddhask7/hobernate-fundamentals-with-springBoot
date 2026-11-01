# Hibernate Fundamentals with Spring Boot

A hands-on Java project demonstrating Hibernate ORM, Spring Boot, and Spring Data JPA concepts with an Oracle database.

## 📌 Project Overview

This project explores how to map Java entities to database tables and perform database operations using Hibernate and Spring Data JPA. It also demonstrates Hibernate annotations for mapping collections and entity attributes.

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **Hibernate ORM**
- **Spring Data JPA**
- **Oracle Database XE**
- **Maven**
- **REST APIs**

## ✨ Concepts Covered

- Entity mapping using `@Entity` and `@Table`
- Primary key mapping using `@Id`
- Column configuration using `@Column`
- Element collections using `@ElementCollection`
- Collection table mapping using `@CollectionTable`
- Foreign key mapping using `@JoinColumn`
- Enum mapping using `@Enumerated`
- Attribute conversion using `@Convert` and `AttributeConverter`
- Embedded objects using `@Embedded` and `@AttributeOverrides`
- Transient fields using `@Transient`
- Date and time mapping using `LocalDate` and `LocalDateTime`
- Database schema generation using Hibernate's `ddl-auto` configuration

## 📂 Project Structure

```text
hiberProj/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ex/
│   │   │       ├── HiberProjApplication.java
│   │   │       ├── entity/
│   │   │       │   ├── Student.java
│   │   │       │   ├── StudentStatus.java
│   │   │       │   ├── Address.java
│   │   │       │   └── BooleanToStringConverter.java
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── controller/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

*Note: The structure above is illustrative. Keep only the packages and classes that exist in your actual repository.*

## ⚙️ Configuration

Configure your Oracle database connection in `src/main/resources/application.properties`.

```properties
spring.application.name=hiberProj
server.port=8081

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=hr
spring.datasource.password=pass
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update
```
 

## 🚀 How to Run the Project

### Prerequisites

- Java Development Kit (JDK)
- Maven
- Oracle Database XE
- An IDE such as IntelliJ IDEA

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/Aniruddhask7/hobern ate-fundamentals-with-springBoot.git
   ```

2. Open the project in your IDE.
3. Configure Oracle database credentials in `application.properties`.
4. Ensure the Oracle database service is running.
5. Run `HiberProjApplication.java`.

The application starts on port `8081`, unless configured otherwise.

## 🗄️ Database Mapping Example

The `Student` entity maps to the `studenthb2` table.

A collection of student skills can be mapped to a separate table using:

```java
@ElementCollection
@CollectionTable(
    name = "student_skills",
    joinColumns = @JoinColumn(name = "student_id")
)
@Column(name = "skill")
private Set<String> skills;
```

This mapping allows one student to have multiple skills, stored as separate rows in the collection table.

## 🎯 Learning Objectives

- Understand object-relational mapping (ORM).
- Learn how Hibernate maps Java objects to database tables.
- Understand collection-table relationships.
- Configure Hibernate with Spring Boot and Oracle.
- Practice JPA annotations through practical examples.
  

⭐ If you find this repository useful, feel free to star it!
