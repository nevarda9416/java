package com.example.demo_java_fw_09.resources;

import com.example.demo_java_fw_09.dto.AddressDTO;
import com.example.demo_java_fw_09.entities.Address;
import com.example.demo_java_fw_09.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressRestController {
    @Autowired
    private IAddressService iAddressService;
    @GetMapping("/getAll")
    public ResponseEntity<List<AddressDTO>> getAll() {
        List<AddressDTO> addressList = iAddressService.getAll();
        return new ResponseEntity<>(addressList, HttpStatus.OK);
    }
}

