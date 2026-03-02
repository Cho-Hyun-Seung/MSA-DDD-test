package com.example.servera.domain.repository;

import com.example.servera.domain.entity.Product;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(Long productId);

    void save(Product product);
}
