package com.example.demo_java_fw_09.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private Long id;
    private String name;
    private String code;
    private ProductDTO productList;
}
