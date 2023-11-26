package com.example.demo_java_fw_09.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeModel {
    private long id;
    private String name;
    private int age;
    private long address_id;
}
