package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.Student;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentRepository.findAll();

    }

    // @GetMapping("/student/{id}")
    // public StudentDto getStudentById() {
    //     return new StudentDto(1234L, "Yash", "deoreyash@gmail.com");

    // }
    

}
