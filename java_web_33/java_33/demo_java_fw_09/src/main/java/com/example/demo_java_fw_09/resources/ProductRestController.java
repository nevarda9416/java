package com.example.demo_java_fw_09.resources;

import com.example.demo_java_fw_09.entities.Product;
import com.example.demo_java_fw_09.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
    @Autowired
    private IProductService iProductService;
    @PostMapping("/save")
    private ResponseEntity<String> save(@RequestBody Product product) {
        iProductService.save(product);
        return new ResponseEntity<>("Add new product successfully", HttpStatus.OK);
    }
}
