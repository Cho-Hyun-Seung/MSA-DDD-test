package com.example.servera.application.product.service;


import com.example.servera.application.product.converter.ProductConverter;
import com.example.servera.domain.entity.Product;
import com.example.servera.domain.repository.ProductRepository;
import com.example.servera.presentation.product.dto.request.CreateProductRequestDTO;
import com.example.servera.presentation.product.dto.response.ProductResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    private final ProductConverter converter;

    public ProductResponseDTO getProduct(Long productId) {
        Product product = repository.findById(productId)
                .orElseThrow(() -> new RuntimeException("product not found"));

        return ProductResponseDTO.from(product);
    }

    public void createProduct(CreateProductRequestDTO request) {
        Product product = converter.toCreateProductCommand(request);

        repository.save(product);
    }
}
