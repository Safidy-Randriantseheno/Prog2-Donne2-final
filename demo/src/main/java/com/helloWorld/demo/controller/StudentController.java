package com.helloWorld.demo.controller;

import com.helloWorld.demo.model.Student;
import com.helloWorld.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.helloWorld.demo.repository.StudentRepository;

import java.util.List;
@CrossOrigin
@RestController

public class StudentController {
    @Autowired
    private StudentRepository repository ;

    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    @GetMapping("/Students/{studentId}")
    public Student getStudentById(@PathVariable long studentId){
        return StudentService.getById(studentId);
    }
}
