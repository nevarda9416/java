package com.example.spring_boot.Controllers;

import com.example.spring_boot.Models.Student;
import com.example.spring_boot.Repositories.Implements.StudentRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController {
    private StudentRepository studentRepository;
    @GetMapping("/students")
    public String listAll(Model model) {
        List<Student> listStudents = studentRepository.findAll();
        model.addAttribute("listStudents", listStudents);
        return "students";
    }
}
