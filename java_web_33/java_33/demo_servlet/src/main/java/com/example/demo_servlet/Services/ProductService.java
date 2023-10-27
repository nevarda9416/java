package com.example.demo_servlet.Services;

import com.example.demo_servlet.Entities.Product;
import com.example.demo_servlet.Repositories.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();
    public List<Product> getAll() throws SQLException {
        return productRepository.getAll();
    }
    public boolean add(Product product) throws SQLException {
        return productRepository.add(product);
    }

    public List<Product> findByCategoryId(int id) throws SQLException {
        return productRepository.findByCategoryId(id);
    }
}
