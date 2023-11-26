package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.dto.AddressDTO;
import com.example.demo_java_fw_09.mapper.AddressMapper;
import com.example.demo_java_fw_09.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {
    @Autowired
    AddressMapper addressMapper;
    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<AddressDTO> getAll() {
        return addressRepository.findAll().stream().map(e->addressMapper.toDTO(e)).toList();
    }

}