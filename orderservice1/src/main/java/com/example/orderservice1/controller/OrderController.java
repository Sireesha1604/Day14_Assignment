package com.example.orderservice1.controller;

import com.example.orderservice1.feign.ProductsServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private ProductsServiceClient productServiceClient;

    @GetMapping("/product-list")
    public String getProductList() {
        return "Calling product service: " + productServiceClient.getProducts();
    }
}
