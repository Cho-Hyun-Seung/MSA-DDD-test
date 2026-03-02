package com.example.orderservice.domain.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Order {
    private final Long orderId;
    private final Long productId;
    private final Integer quantity;
}
