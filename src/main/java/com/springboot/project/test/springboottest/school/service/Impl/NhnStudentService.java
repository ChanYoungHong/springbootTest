package com.springboot.project.test.springboottest.school.service.Impl;

import com.springboot.project.test.springboottest.school.entity.Student;
import com.springboot.project.test.springboottest.school.repo.StudentRepo;
import com.springboot.project.test.springboottest.school.service.StudentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NhnStudentService implements StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public NhnStudentService(
        StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    @Override
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepo.findById(id)
            .orElseThrow();
    }

    @Override
    @Transactional
    public Boolean createStudent(Student student) {
        boolean present = studentRepo.findById(student.getId()).isPresent();
        if(present) throw new IllegalStateException("이미 존재하는 아이디입니다" +
            student.getId());

        studentRepo.save(student);
        return true;
    }

    @Override
    @Transactional
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
