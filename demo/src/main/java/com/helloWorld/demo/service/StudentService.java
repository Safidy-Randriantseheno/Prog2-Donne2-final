package com.helloWorld.demo.service;

import com.helloWorld.demo.model.Student;
import com.helloWorld.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService{
    private final StudentRepository repository;
    public static Student getById(Long studentId){
        return repository.getReferenceById(studentId);
    }
    public List<Student> getAll(){return repository.findAll(); }
    @Transactional
    public List<Student> saveAll(List<Student> students){
        return repository.saveAll(students);
    }
}
