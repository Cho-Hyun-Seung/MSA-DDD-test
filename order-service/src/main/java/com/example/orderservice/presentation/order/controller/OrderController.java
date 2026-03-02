package com.example.orderservice.presentation.order.controller;


import com.example.orderservice.application.order.service.OrderService;
import com.example.orderservice.presentation.order.dto.request.CreateOrderRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> createOrder(
            @RequestBody CreateOrderRequestDTO dto
    ) {

        orderService.createOrder(dto);

        return ResponseEntity.ok().build();
    }
}