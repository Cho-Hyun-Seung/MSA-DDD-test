package com.example.orderservice.infrastructure.client;


import com.example.orderservice.infrastructure.client.dto.response.ProductResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://product-service:8080/api")
public interface ProductFeignClient {

    @GetMapping("/product/{id}")
    ProductResponseDTO getProduct(@PathVariable Long id);
}