package com.example.servera.presentation.product.dto.response;


import com.example.servera.domain.entity.Product;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductResponseDTO {

    private Long productId;
    private String productName;
    private Integer productPrice;

    public static ProductResponseDTO from(Product product) {
        return ProductResponseDTO.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .productPrice(product.getProductPrice())
                .build();
    }
}
