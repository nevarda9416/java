package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.dto.EmployeeDTO;
import com.example.demo_java_fw_09.model.EmployeeModel;

import java.util.List;

public interface IEmployeeService {
    List<EmployeeDTO> getAll();

    void save(EmployeeModel employeeModel);
}


