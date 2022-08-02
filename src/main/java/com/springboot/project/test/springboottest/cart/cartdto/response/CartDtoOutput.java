package com.springboot.project.test.springboottest.cart.cartdto.response;

import com.springboot.project.test.springboottest.cart.entity.Cart;
import com.springboot.project.test.springboottest.product.entity.Product;
import jdk.jfr.StackTrace;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Builder
@Setter
@NoArgsConstructor
public class CartDtoOutput {

    private Long id;
    private String productName;
    private int price;
    private int qty;

    public static CartDtoOutput of(Cart cart, Product product) {
        return CartDtoOutput.builder()
            .id(cart.getId())
            .qty(cart.getQty())
            .productName(product.getName())
            .price(product.getPrice())
            .build();
    }

}
