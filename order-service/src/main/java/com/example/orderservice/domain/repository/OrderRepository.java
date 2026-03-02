package com.example.orderservice.domain.repository;

import com.example.orderservice.domain.entity.Order;

public interface OrderRepository {
    void save(Order order);
}
