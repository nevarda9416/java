package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.entities.Student;
import com.example.demo_java_fw_09.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
