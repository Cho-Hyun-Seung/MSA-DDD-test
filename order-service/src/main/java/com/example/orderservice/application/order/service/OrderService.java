package com.example.orderservice.application.order.service;


import com.example.orderservice.application.order.converter.OrderConverter;
import com.example.orderservice.domain.entity.Order;
import com.example.orderservice.domain.repository.OrderRepository;
import com.example.orderservice.infrastructure.client.ProductFeignClient;
import com.example.orderservice.infrastructure.client.dto.response.ProductResponseDTO;
import com.example.orderservice.presentation.order.controller.OrderController;
import com.example.orderservice.presentation.order.dto.request.CreateOrderRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final ProductFeignClient productClient;
    private final OrderRepository orderRepository;
    private final OrderConverter orderConverter;

    public void createOrder(CreateOrderRequestDTO dto) {

        ProductResponseDTO response = productClient.getProduct(dto.getProductId());

        Order order = orderConverter.toOrder(dto, response);

        orderRepository.save(order);

    }
}
