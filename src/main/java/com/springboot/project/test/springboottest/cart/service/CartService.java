package com.springboot.project.test.springboottest.cart.service;

import com.springboot.project.test.springboottest.cart.cartdto.request.CartDtoInput;
import com.springboot.project.test.springboottest.cart.cartdto.response.CartDtoOutput;
import com.springboot.project.test.springboottest.cart.entity.Cart;
import java.util.List;

public interface CartService {

    Cart addCart(CartDtoInput cartDtoInput);
    List<CartDtoOutput> getAll();
    CartDtoOutput getCartById(Long id);

}
