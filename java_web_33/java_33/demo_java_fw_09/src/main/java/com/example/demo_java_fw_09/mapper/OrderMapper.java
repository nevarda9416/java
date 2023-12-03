package com.example.demo_java_fw_09.mapper;

import com.example.demo_java_fw_09.dto.OrderDTO;
import com.example.demo_java_fw_09.dto.ProductDTO;
import com.example.demo_java_fw_09.entities.Order;
import com.example.demo_java_fw_09.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    Product product;
    public OrderDTO toDTO(Order order) {
        return OrderDTO.builder(
                ).id(order.getId())
                .name(order.getName())
                .code(order.getCode())
                .productList(new ProductDTO())
                .build();
    }
}
