package com.example.demo_java_fw_09.repositories;

import com.example.demo_java_fw_09.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByName(String name);
}
