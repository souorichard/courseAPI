package com.richard.controller;

import com.richard.model.Students;
import com.richard.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping("/all")
    public List<Students> list() {
        return studentsRepository.findAll();
    }

}
