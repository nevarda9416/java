package com.example.demo_servlet.Controllers;

import com.example.demo_servlet.Entities.Student;
import com.example.demo_servlet.Services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletAddStudent", value = "/ServletAddStudent")
public class ServletAddStudent extends HttpServlet {
    private StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        student.setName(req.getParameter("name"));
        student.setAddress(req.getParameter("address"));
        student.setAge(Integer.parseInt(req.getParameter("age")));
        System.out.println(student);
        studentService.add(student);
        resp.sendRedirect("StudentServlet");
    }
}

