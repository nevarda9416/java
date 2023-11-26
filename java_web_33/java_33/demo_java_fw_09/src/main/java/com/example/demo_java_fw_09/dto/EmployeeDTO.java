package com.example.demo_java_fw_09.dto;

import com.example.demo_java_fw_09.entities.Employee;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDTO {
private Long id;
private String name;
private int age;
private AddressDTO listAddress;
}
