package com.example.demo_servlet.Controllers.Category;

import com.example.demo_servlet.Entities.SubCategory;
import com.example.demo_servlet.Services.CategoryService;
import com.example.demo_servlet.Services.SubCategoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CategoryAddSubController", value = "/Category/AddSubController")
public class AddSubController extends HttpServlet {
    private CategoryService categoryService = new CategoryService();
    private SubCategoryService subCategoryService = new SubCategoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", categoryService.getAll());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/category/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SubCategory subCategory = new SubCategory();
        subCategory.setName(req.getParameter("name"));
        subCategory.setCategoryId(Integer.parseInt(req.getParameter("category_id")));
        subCategory.setStatus(1); // default status
        subCategoryService.add(subCategory);
        resp.sendRedirect("AddController");
    }
}
