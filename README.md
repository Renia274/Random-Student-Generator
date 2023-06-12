# Random-Student-Generator

This is a simple Java application that generates random student objects with unique IDs, names, email addresses, dates of birth, and ages. The application utilizes the Spring Boot framework and follows the MVC (Model-View-Controller) architecture.

## Features

- Generates a specified number of random student objects with unique details.
- Randomly assigns names, email addresses, dates of birth, and ages to each student.
- Ensures that the generated names and email addresses are unique.
- Provides an API endpoint to retrieve the generated list of students.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven build tool

## Getting Started

Follow these steps to get the application up and running on your local machine:

1. Clone the repository:

       git clone https://github.com/Renia274/Random-Student-Generator.git

2.Navigate to the project directory:

    cd Random-Student-Generator

3.Build the project using Maven:

    mvn clean install

4.Run the application:

    mvn spring-boot:run

    The application will start, and you can access the API endpoint at http://localhost:8080/api/v1/student
## Configuration

You can customize the behavior of the application by modifying the following constants in the StudentService class:

    NUMBER_OF_STUDENTS: Specifies the total number of students to generate.
    NAMES: Provides a list of available names to assign to the students.
    EMAIL_DOMAINS: Provides a list of available email domains for generating email addresses.
    MIN_AGE and MAX_AGE: Define the range of ages for the generated students.

