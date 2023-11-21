package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.dto.StudentDTO;
import com.example.demo_java_fw_09.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    List<Student> search(String keyword);

    int save(StudentDTO studentDTO);

    Student findById(Long id);

    void deleteById(Long id);
}