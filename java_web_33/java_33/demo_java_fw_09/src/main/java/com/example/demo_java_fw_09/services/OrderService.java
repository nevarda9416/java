package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.dto.OrderDTO;
import com.example.demo_java_fw_09.entities.Order;
import com.example.demo_java_fw_09.mapper.OrderMapper;
import com.example.demo_java_fw_09.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<OrderDTO> getAll() {
        return orderRepository.findAll().stream().map(e -> orderMapper.toDTO(e)).toList();
    }

    @Override
    public int save(Order order) {
        try {
            orderRepository.save(order);
            return 1;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return 0;
        }
    }
}
