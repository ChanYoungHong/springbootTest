package com.springboot.project.test.springboottest.user.service;

import com.springboot.project.test.springboottest.user.entity.User;
import java.util.List;

public interface UserService {

    User addUser(User user);
    List<User> getAll();

}
