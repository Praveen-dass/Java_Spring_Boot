package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @PostMapping("/api/product")
    public ResponseEntity<Product> postMethodName(@RequestBody Product product) {
        if(productService.safe(product) == false)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/api/products")
    public List<Product> getMethodName() {
        return productService.getallproduct();
    }

    @GetMapping("/api/product/{productId}")
    public Product getMethodNamee(@PathVariable int productId) {
        return productService.get_id(productId);
    }
}
