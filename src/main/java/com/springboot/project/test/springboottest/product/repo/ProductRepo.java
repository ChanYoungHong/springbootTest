package com.springboot.project.test.springboottest.product.repo;

import com.springboot.project.test.springboottest.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
