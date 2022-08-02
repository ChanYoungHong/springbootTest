package com.springboot.project.test.springboottest.cart.cartdto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CartDtoInput {

    private Long userId;
    private Long productId;
    private int qty;

}
