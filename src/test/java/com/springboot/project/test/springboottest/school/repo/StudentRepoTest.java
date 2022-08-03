package com.springboot.project.test.springboottest.school.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.springboot.project.test.springboottest.school.entity.Student;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StudentRepoTest {

    @Autowired
    StudentRepo studentRepo;

    @Test
    void testStudentRepo() {
        Student zbum = new Student(1L, "zbum", 100);
        studentRepo.save(zbum);

        Optional<Student> actual = studentRepo.findById(1L);

        assertThat(actual).isPresent();
        assertThat(actual.get()).isEqualTo(zbum);
    }

}