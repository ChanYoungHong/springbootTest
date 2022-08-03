package com.springboot.project.test.springboottest.school.repo;

import com.springboot.project.test.springboottest.school.entity.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
