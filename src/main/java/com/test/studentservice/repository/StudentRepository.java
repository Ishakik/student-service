package com.test.studentservice.repository;

import com.test.studentservice.models.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student save(Student student);
    List<Student> findAll();
    void deleteById(int id);

}
