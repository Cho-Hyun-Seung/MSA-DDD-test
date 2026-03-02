package com.example.servera.infrastructure.product.repository;

import com.example.servera.infrastructure.product.entity.ProductJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductJpaEntity, Long> {
}
