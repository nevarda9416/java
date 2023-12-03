package com.example.demo_java_fw_09.dto;

import com.example.demo_java_fw_09.entities.Product;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Long id;
    private String name;
    private String code;
}
