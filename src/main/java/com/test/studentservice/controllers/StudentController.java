package com.test.studentservice.controllers;

import com.test.studentservice.models.Student;
import com.test.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student/add")
    Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/student/all")
    List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @DeleteMapping("/student/delete/{id}")
    void deleteStudent(@PathVariable int id) {
        studentRepository.deleteById(id);
    }
}
