package com.springboot.project.test.springboottest.school.service;

import com.springboot.project.test.springboottest.school.entity.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getStudents();
    Student getStudent(Long id);
    Boolean createStudent(Student student);
    void deleteStudent(Long id);

}
