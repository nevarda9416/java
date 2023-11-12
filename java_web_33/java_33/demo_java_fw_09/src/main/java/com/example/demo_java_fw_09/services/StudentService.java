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

    @Override
    public List<Student> search(String keyword) {
        System.out.println("Keyword: " + keyword);
        return studentRepository.findByName(keyword);
    }

    @Override
    public void save(Student studentDTO) {
        try {
            studentRepository.save(studentDTO);
        } catch (Exception exception) {
        }
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }
}
