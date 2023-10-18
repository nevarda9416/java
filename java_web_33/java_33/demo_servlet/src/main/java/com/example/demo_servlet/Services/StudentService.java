package com.example.demo_servlet.Services;

import com.example.demo_servlet.Entities.Student;
import com.example.demo_servlet.Repositories.StudentRepository;

import java.util.List;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();

    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    public boolean update(Student student) {
        return studentRepository.update(student);
    }

    public boolean delete(int id) {
        return studentRepository.delete(id);
    }

    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    public boolean add(Student student) {
        return studentRepository.add(student);
    }
}
