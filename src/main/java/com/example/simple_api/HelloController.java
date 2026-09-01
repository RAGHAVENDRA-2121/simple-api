package com.example.simple_api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/student")
    public student getStudent() {
        return new student(1, "Raghu", "Java");
    }

    @GetMapping("/students")
    public List<student> getStudents() {
        return Arrays.asList(
            new student(1, "Raghu", "Java"),
            new student(2, "suchi", "Spring Boot"),
            new student(3, "abhay", "Microservices")
        );
    }
}