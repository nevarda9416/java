package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.entities.Product;
import com.example.demo_java_fw_09.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{
    @Autowired
    ProductRepository productRepository;
    @Override
    public int save(Product product) {
        try {
            productRepository.save(product);
            return 1;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return 0;
        }
    }
}
