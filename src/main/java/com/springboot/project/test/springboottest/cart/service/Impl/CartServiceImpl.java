package com.springboot.project.test.springboottest.cart.service.Impl;

import com.springboot.project.test.springboottest.cart.cartdto.request.CartDtoInput;
import com.springboot.project.test.springboottest.cart.cartdto.response.CartDtoOutput;
import com.springboot.project.test.springboottest.cart.entity.Cart;
import com.springboot.project.test.springboottest.cart.repo.CartRepo;
import com.springboot.project.test.springboottest.cart.service.CartService;
import com.springboot.project.test.springboottest.product.repo.ProductRepo;
import com.springboot.project.test.springboottest.user.repo.UserRepo;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CartServiceImpl implements CartService {

    private final ProductRepo productRepo;
    private final UserRepo userRepo;
    private final CartRepo cartRepo;

    @Autowired
    public CartServiceImpl(
        ProductRepo productRepo, UserRepo userRepo,
        CartRepo cartRepo) {
        this.productRepo = productRepo;
        this.userRepo = userRepo;
        this.cartRepo = cartRepo;
    }


    @Override
    public Cart addCart(CartDtoInput cartDtoInput) {
        return cartRepo.save(Cart.builder()
            .product(productRepo.findById(cartDtoInput.getProductId()).get())
            .user(userRepo.findById(cartDtoInput.getUserId()).get())
            .qty(cartDtoInput.getQty())
            .build());
    }

    @Override
    public List<CartDtoOutput> getAll() {
        List<Cart> cartList = cartRepo.findAll();
        List<CartDtoOutput> cartDtoOutputList = new ArrayList<>();

        cartList.stream().map(cart -> {
            return cartDtoOutputList.add(
                CartDtoOutput.builder()
                    .id(cart.getId())
                    .productName(cart.getProduct().getName())
                    .qty(cart.getQty())
                    .price(cart.getProduct().getPrice())
                    .build()
            );
        });
        return cartDtoOutputList;
    }

    @Override
    public CartDtoOutput getCartById(Long id) {
        Cart cart = cartRepo.findById(id).get();

        return CartDtoOutput.builder()
            .id(cart.getId())
            .productName(cart.getProduct().getName())
            .qty(cart.getQty())
            .price(cart.getProduct().getPrice())
            .build();
    }
}
