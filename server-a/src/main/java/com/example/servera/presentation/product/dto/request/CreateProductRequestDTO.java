package com.example.servera.presentation.product.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateProductRequestDTO {

    private String productName;
    private Integer productPrice;
}