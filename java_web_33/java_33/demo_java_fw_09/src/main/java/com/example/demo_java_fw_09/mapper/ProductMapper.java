package com.example.demo_java_fw_09.mapper;

import com.example.demo_java_fw_09.dto.ProductDTO;
import com.example.demo_java_fw_09.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductDTO toDTO(Product product) {
        return ProductDTO.builder(
                ).id(product.getId())
                .name(product.getName())
                .code(product.getCode())
                .build();
    }
}
