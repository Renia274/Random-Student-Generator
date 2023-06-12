package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StudentService {

    private static final int NUMBER_OF_STUDENTS = 10; // Total number of students to generate
    private static final List<String> NAMES = List.of(
            "John", "Jane", "David", "Emma", "Michael", "Olivia", "William", "Sophia", "James", "Ava"); // List of available names
    private static final List<String> EMAIL_DOMAINS = List.of(
            "example.com", "test.com", "dummy.com", "sample.com", "school.edu"); // List of available email domains
    private static final int MIN_AGE = 18; // Minimum age for students
    private static final int MAX_AGE = 25; // Maximum age for students

    private Random random = new Random();

    /**
     * Get a list of randomly generated student objects.
     *
     * @return List of Student objects
     */
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        List<String> usedNames = new ArrayList<>();

        for (long id = 1; id <= NUMBER_OF_STUDENTS; id++) {
            String name = generateRandomName(usedNames);
            String email = generateRandomEmail(name);
            LocalDate birthDate = generateRandomBirthDate();
            int age = generateRandomAge();

            Student student = new Student(id, name, email, birthDate, age);
            students.add(student);
        }

        return students;
    }

    /**
     * Generate a random name that is not already used.
     *
     * @param usedNames List of already used names
     * @return Random name
     */
    private String generateRandomName(List<String> usedNames) {
        String name;
        do {
            name = NAMES.get(random.nextInt(NAMES.size()));
        } while (usedNames.contains(name));
        usedNames.add(name);
        return name;
    }

    /**
     * Generate a random email address based on the name.
     *
     * @param name Name of the student
     * @return Random email address
     */
    private String generateRandomEmail(String name) {
        String domain = EMAIL_DOMAINS.get(random.nextInt(EMAIL_DOMAINS.size()));
        return name.toLowerCase() + "@" + domain;
    }

    /**
     * Generate a random birth date.
     *
     * @return Random birth date
     */
    private LocalDate generateRandomBirthDate() {
        int year = random.nextInt(30) + 1970; // Random year between 1970 and 1999
        int month = random.nextInt(12) + 1; // Random month between 1 and 12
        int day = random.nextInt(28) + 1; // Random day between 1 and 28
        return LocalDate.of(year, month, day);
    }

    /**
     * Generate a random age within the specified range.
     *
     * @return Random age
     */
    private int generateRandomAge() {
        return random.nextInt(MAX_AGE - MIN_AGE + 1) + MIN_AGE;
    }
}

