package com.example.demo_java_fw_09.controllers;

import com.example.demo_java_fw_09.dto.StudentDTO;
import com.example.demo_java_fw_09.entities.Student;
import com.example.demo_java_fw_09.repositories.StudentRepository;
import com.example.demo_java_fw_09.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("admin")
public class StudentController {
    @Autowired
    IStudentService studentService;
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/getAll")
    public String homeStudent(Model model) {
        List<Student> studentList = studentService.getAll();
        model.addAttribute("students", studentList);
        return "admin/student";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("student", new StudentDTO());
        return "admin/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute StudentDTO studentDTO) {
        studentService.save(studentDTO.toEntity());
        System.out.println(studentDTO);
        return "redirect:/admin/getAll";
    }

    @GetMapping("/search")
    public String homeStudent(Model model, @RequestParam("keyword") String keyword) {
        List<Student> studentList;
        if (keyword.isEmpty()) {
            studentList = studentService.getAll();
        } else {
            studentList = studentService.search(keyword);
        }
        System.out.println(studentList);
        model.addAttribute("students", studentList);
        return "admin/student";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Long id) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "admin/edit";
    }

    @PostMapping("/edit")
    public String edit(Model model, @ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/admin/getAll";
    }
}
