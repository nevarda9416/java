package com.example.demo_servlet.Services;

import com.example.demo_servlet.Entities.Product;
import com.example.demo_servlet.Repositories.ProductRepository;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();
    public List<Product> getAll() {
        return productRepository.getAll();
    }
    public boolean add(Product product) {
        return productRepository.add(product);
    }
}
