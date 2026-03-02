package com.example.servera.infrastructure.product.repository.impl;

import com.example.servera.domain.entity.Product;
import com.example.servera.domain.repository.ProductRepository;
import com.example.servera.infrastructure.product.entity.ProductJpaEntity;
import com.example.servera.infrastructure.product.mapper.ProductMapper;
import com.example.servera.infrastructure.product.repository.ProductJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductJpaRepository repository;
    private final ProductMapper mapper;

    @Override
    public Optional<Product> findById(Long productId) {
        return repository.findById(productId)
                .map(mapper::toDomain);
    }

    @Override
    public void save(Product product) {

        ProductJpaEntity entity = mapper.toEntity(product);

        repository.save(entity);
    }
}
