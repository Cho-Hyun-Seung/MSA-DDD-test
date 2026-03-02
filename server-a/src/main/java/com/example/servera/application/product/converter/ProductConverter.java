package com.example.servera.application.product.converter;

import com.example.servera.domain.entity.Product;
import com.example.servera.presentation.product.dto.request.CreateProductRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public Product toCreateProductCommand(CreateProductRequestDTO dto){
        return Product.builder()
                .productName(dto.getProductName())
                .productPrice(dto.getProductPrice())
                .build();
    }
}
