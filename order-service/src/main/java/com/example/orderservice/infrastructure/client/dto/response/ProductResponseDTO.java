package com.example.orderservice.infrastructure.client.dto.response;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ProductResponseDTO {
    private Long productId;
    private String productName;
    private Integer productPrice;
}
