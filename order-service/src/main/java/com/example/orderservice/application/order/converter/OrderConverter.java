package com.example.orderservice.application.order.converter;

import com.example.orderservice.domain.entity.Order;
import com.example.orderservice.infrastructure.client.dto.response.ProductResponseDTO;
import com.example.orderservice.presentation.order.dto.request.CreateOrderRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public Order toOrder(CreateOrderRequestDTO createOrderRequestDTO, ProductResponseDTO productResponseDTO){
        return Order.builder()
                .productId(productResponseDTO.getProductId())
                .quantity(createOrderRequestDTO.getQuantity())
                .build();

    }
}
