package com.example.demo_servlet.Controllers.Category;

import com.example.demo_servlet.DTO.CategoryDTO;
import com.example.demo_servlet.Entities.Category;
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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="IndexController", value = "/IndexController")
public class IndexController extends HttpServlet {
    private CategoryService categoryService = new CategoryService();
    private SubCategoryService subCategoryService = new SubCategoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for (Category category: categoryService.getAll()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setName(category.getName());
            categoryDTO.setStatus(category.getStatus());
            for (SubCategory subCategory: subCategoryService.getAll()) {
                if (category.getId() == subCategory.getId()) {
                    categoryDTO.getSubCategoryList().add(subCategory);
                }
            }
            categoryDTOList.add(categoryDTO);
        }
        req.setAttribute("categories", categoryDTOList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("client.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
