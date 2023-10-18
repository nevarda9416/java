package com.example.demo_servlet.Controllers.Student;

import com.example.demo_servlet.Entities.Student;
import com.example.demo_servlet.Services.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchController", value = "/SearchController")
public class SearchController extends HttpServlet {
    private StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        req.setAttribute("name", name);
        List<Student> studentList = studentService.findByName(name);
        req.setAttribute("listStudent", studentList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("student/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
