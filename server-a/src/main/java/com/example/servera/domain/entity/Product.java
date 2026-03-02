package com.example.servera.domain.entity;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Product {
    private Long productId;
    private String productName;
    private Integer productPrice;
}
