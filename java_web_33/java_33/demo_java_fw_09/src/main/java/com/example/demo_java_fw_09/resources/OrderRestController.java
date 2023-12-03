package com.example.demo_java_fw_09.resources;

import com.example.demo_java_fw_09.dto.OrderDTO;
import com.example.demo_java_fw_09.entities.Order;
import com.example.demo_java_fw_09.entities.Student;
import com.example.demo_java_fw_09.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {
    @Autowired
    private IOrderService iOrderService;
    @PostMapping("/save")
    private ResponseEntity<String> save(@RequestBody Order order) {
        iOrderService.save(order);
        return new ResponseEntity<>("Add new order successfully", HttpStatus.OK);
    }
    @GetMapping("/all")
    private ResponseEntity<List<OrderDTO>> getAll() {
        List<OrderDTO> orders = iOrderService.getAll();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
