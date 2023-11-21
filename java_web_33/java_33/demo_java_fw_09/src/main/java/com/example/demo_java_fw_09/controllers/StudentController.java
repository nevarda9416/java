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

    @GetMapping("/students")
    public String homeStudent(Model model) {
        List<Student> studentList = studentService.getAll();
        model.addAttribute("keyword", "");
        model.addAttribute("students", studentList);
        return "admin/student/index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("student", new StudentDTO());
        return "admin/student/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute StudentDTO studentDTO) {
        studentService.save(studentDTO);
        return "redirect:/admin/students";
    }

    @GetMapping("/search")
    public String homeStudent(Model model, @RequestParam("keyword") String keyword) {
        List<Student> studentList;
        if (keyword.isEmpty()) {
            studentList = studentService.getAll();
        } else {
            studentList = studentService.search(keyword);
        }
        model.addAttribute("keyword", keyword);
        model.addAttribute("students", studentList);
        return "admin/student/index";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Long id) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "admin/student/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("student") StudentDTO studentDTO) {
        studentService.save(studentDTO);
        return "redirect:/admin/students";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        studentService.deleteById(id);
        return "redirect:/admin/students";
    }
}
