package com.example.orderservice.infrastructure.order.repository.impl;

import com.example.orderservice.domain.entity.Order;
import com.example.orderservice.domain.repository.OrderRepository;
import com.example.orderservice.infrastructure.order.entity.OrderJpaEntity;
import com.example.orderservice.infrastructure.order.mapper.OrderMapper;
import com.example.orderservice.infrastructure.order.repository.OrderJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {
    private final OrderJpaRepository repository;
    private final OrderMapper mapper;

    @Override
    public void save(Order order) {
        OrderJpaEntity entity = mapper.toEntity(order);

        repository.save(entity);
    }
}
