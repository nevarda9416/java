package com.example.demo_servlet.Controllers.Category;

import com.example.demo_servlet.DTO.CategoryDTO;
import com.example.demo_servlet.Entities.Category;
import com.example.demo_servlet.Entities.Product;
import com.example.demo_servlet.Entities.SubCategory;
import com.example.demo_servlet.Services.CategoryService;
import com.example.demo_servlet.Services.ProductService;
import com.example.demo_servlet.Services.SubCategoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="IndexController", value = "/IndexController")
public class IndexController extends HttpServlet {
    private CategoryService categoryService = new CategoryService();
    private SubCategoryService subCategoryService = new SubCategoryService();
    private ProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = 0;
        if (req.getParameterMap().containsKey("id")) {
            id = Integer.parseInt(req.getParameter("id"));
        }
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        List<Product> productList;
        if (id > 0) {
            try {
                productList = productService.findByCategoryId(id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                productList = productService.getAll();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
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
        System.out.println(productList);
        req.setAttribute("products", productList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("client.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
