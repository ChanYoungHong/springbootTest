package com.springboot.project.test.springboottest.user.controller;

import com.springboot.project.test.springboottest.user.entity.User;
import com.springboot.project.test.springboottest.user.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(
        UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/add")
    public User addUser(User user){
        return userService.addUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

}
