package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(1234L, "Yash", "deoreyash@gmail.com");

    }
    

}
