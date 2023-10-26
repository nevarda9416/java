package com.example.demo_servlet.Services;

import com.example.demo_servlet.Entities.Product;
import com.example.demo_servlet.Repositories.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();
    public boolean add(Product product) {
        return productRepository.add(product);
    }
}
