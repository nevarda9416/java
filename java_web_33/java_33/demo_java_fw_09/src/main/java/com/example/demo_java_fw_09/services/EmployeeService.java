package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.dto.EmployeeDTO;
import com.example.demo_java_fw_09.entities.Employee;
import com.example.demo_java_fw_09.mapper.EmployeeMapper;
import com.example.demo_java_fw_09.model.EmployeeModel;
import com.example.demo_java_fw_09.repositories.AddressRepository;
import com.example.demo_java_fw_09.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeMapper employeeMapper;
@Autowired
private AddressRepository addressRepository;
    @Override
    public List<EmployeeDTO> getAll() {
        return employeeRepository.findAll().stream().map(e->employeeMapper.toDTO(e)).toList();
    }

    @Override
    public void save(EmployeeModel employeeModel) {
        Employee employee = new Employee();
        employee.setName(employeeModel.getName());
        employee.setAge(employeeModel.getAge());
        employee.setAddress(addressRepository.findById(employeeModel.getAddress_id()).get());
        employeeRepository.save(employee);
    }

}
