package com.springboot.project.test.springboottest.user.repo;

import com.springboot.project.test.springboottest.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
