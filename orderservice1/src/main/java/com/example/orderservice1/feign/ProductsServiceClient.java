package com.example.orderservice1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface ProductsServiceClient {

    @GetMapping("/products")
    String getProducts();
}
