package com.example.orderservice.infrastructure.order.repository;

import com.example.orderservice.infrastructure.order.entity.OrderJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderJpaEntity, Long> {
}
