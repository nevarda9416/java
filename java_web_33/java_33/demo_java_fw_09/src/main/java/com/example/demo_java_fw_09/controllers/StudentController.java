package com.example.demo_java_fw_09.controllers;

import com.example.demo_java_fw_09.entities.Student;
import com.example.demo_java_fw_09.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin")
public class StudentController {
    @Autowired
    IStudentService studentService;
    @GetMapping("/getAll")
    public String homeStudent() {
        List<Student> studentList = studentService.getAll();
        System.out.println(studentList.toString());
        return "admin/student";
    }
}
