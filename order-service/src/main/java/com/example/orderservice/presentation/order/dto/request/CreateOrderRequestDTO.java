package com.example.orderservice.presentation.order.dto.request;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CreateOrderRequestDTO {

    private Long productId;
    private Integer quantity;
}
