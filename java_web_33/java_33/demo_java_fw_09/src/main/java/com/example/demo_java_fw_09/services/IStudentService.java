package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    List<Student> search(String keyword);

    void save(Student studentDTO);

    Student findById(Long id);
}