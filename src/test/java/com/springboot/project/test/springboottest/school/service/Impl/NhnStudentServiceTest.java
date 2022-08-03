package com.springboot.project.test.springboottest.school.service.Impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.springboot.project.test.springboottest.school.entity.Student;
import com.springboot.project.test.springboottest.school.service.StudentService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NhnStudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    void getStudents() {
        List<Student> actual = studentService.getStudents();

        assertThat(actual).hasSize(2);
    }
}