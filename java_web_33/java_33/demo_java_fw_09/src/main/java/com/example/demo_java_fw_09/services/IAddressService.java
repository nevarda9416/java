package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.dto.AddressDTO;

import java.util.List;

public interface IAddressService {
    List<AddressDTO> getAll();
}