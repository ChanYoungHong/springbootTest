package com.springboot.project.test.springboottest.cart.repo;

import com.springboot.project.test.springboottest.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {

}
