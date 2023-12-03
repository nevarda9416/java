package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.dto.OrderDTO;
import com.example.demo_java_fw_09.entities.Order;

import java.util.List;

public interface IOrderService {
    List<OrderDTO> getAll();

    int save(Order order);
}
