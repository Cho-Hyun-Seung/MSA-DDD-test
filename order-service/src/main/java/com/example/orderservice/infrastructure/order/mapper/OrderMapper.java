package com.example.orderservice.infrastructure.order.mapper;

import com.example.orderservice.domain.entity.Order;
import com.example.orderservice.infrastructure.order.entity.OrderJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public OrderJpaEntity toEntity(Order order) {
        return new OrderJpaEntity(
                order.getQuantity(),
                order.getProductId()
        );
    }

}