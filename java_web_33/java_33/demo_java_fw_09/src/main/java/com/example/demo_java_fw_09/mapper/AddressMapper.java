package com.example.demo_java_fw_09.mapper;

import com.example.demo_java_fw_09.dto.AddressDTO;
import com.example.demo_java_fw_09.entities.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public AddressDTO toDTO(Address address) {
        return AddressDTO.builder(
                ).id(address.getId())
                .name(address.getName()).code(address.getCode())
                .build();
    }
}
