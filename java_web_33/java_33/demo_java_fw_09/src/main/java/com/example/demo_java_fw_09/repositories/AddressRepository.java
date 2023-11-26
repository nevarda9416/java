package com.example.demo_java_fw_09.repositories;

import com.example.demo_java_fw_09.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
