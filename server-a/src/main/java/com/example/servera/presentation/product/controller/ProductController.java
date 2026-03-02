package com.example.servera.presentation.product.controller;


import com.example.servera.application.product.service.ProductService;
import com.example.servera.domain.common.dto.ApiResponse;
import com.example.servera.presentation.product.dto.request.CreateProductRequestDTO;
import com.example.servera.presentation.product.dto.response.ProductResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(("/api/product"))
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public ApiResponse<ProductResponseDTO> getProduct(
            @PathVariable("id") Long productId
    ){
        ProductResponseDTO response = productService.getProduct(productId);


        return ApiResponse.success(response);
    }

    @PostMapping
    public ApiResponse<Void> createProduct(
            @RequestBody CreateProductRequestDTO request
    ){
        productService.createProduct(request);

        return ApiResponse.success(null);
    }
}
