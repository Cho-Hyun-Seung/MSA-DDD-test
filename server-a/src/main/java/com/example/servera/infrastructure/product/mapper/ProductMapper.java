package com.example.servera.infrastructure.product.mapper;

import com.example.servera.domain.entity.Product;
import com.example.servera.infrastructure.product.entity.ProductJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toDomain(ProductJpaEntity entity){
        if(entity == null) return null;

        return Product.builder()
                .productId(entity.getProductId())
                .productPrice(entity.getProductPrice())
                .productName(entity.getProductName())
                .build();
    }


    public ProductJpaEntity toEntity(Product product) {
        return new ProductJpaEntity(
                product.getProductName(),
                product.getProductPrice()
        );
    }
}
