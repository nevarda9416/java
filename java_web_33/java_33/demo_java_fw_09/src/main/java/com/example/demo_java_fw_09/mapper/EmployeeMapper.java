package com.example.demo_java_fw_09.mapper;

import com.example.demo_java_fw_09.dto.AddressDTO;
import com.example.demo_java_fw_09.dto.EmployeeDTO;
import com.example.demo_java_fw_09.entities.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public EmployeeDTO toDTO(Employee employee) {
        return EmployeeDTO.builder(
        ).id(employee.getId())
                .name(employee.getName())
                .age(employee.getAge())
                .listAddress(new AddressDTO(employee.getAddress().getId(), employee.getAddress().getName(), employee.getAddress().getCode()))
                .build();
    }
}
