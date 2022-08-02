package com.springboot.project.test.springboottest.user.service.Impl;

import com.springboot.project.test.springboottest.user.entity.User;
import com.springboot.project.test.springboottest.user.repo.UserRepo;
import com.springboot.project.test.springboottest.user.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }


}
