package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService; // Initialize the studentService field with the provided StudentService instance
    }

    /**
     * Get a list of all students.
     *
     * @return List of Student objects
     */
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents(); // Retrieve the list of students from the studentService
    }
}


