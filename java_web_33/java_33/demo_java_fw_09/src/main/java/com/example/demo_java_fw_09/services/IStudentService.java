package com.example.demo_java_fw_09.services;

import com.example.demo_java_fw_09.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();
}