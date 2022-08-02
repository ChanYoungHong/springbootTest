package com.springboot.project.test.springboottest.product.entity;

import javax.persistence.Entity;

@Entity
public class Ticket extends Product {

    private String ticketNum;
    private String ticketBrand;

}
