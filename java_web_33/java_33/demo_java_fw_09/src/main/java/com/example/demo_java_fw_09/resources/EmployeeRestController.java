package com.example.demo_java_fw_09.resources;

import com.example.demo_java_fw_09.dto.EmployeeDTO;
import com.example.demo_java_fw_09.model.EmployeeModel;
import com.example.demo_java_fw_09.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeRestController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeDTO>> getAll() {
        List<EmployeeDTO> employeeList = iEmployeeService.getAll();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody EmployeeModel employeeModel) {
        iEmployeeService.save(employeeModel);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}



