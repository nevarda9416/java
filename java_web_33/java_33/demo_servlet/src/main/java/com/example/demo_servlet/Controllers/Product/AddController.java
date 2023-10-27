package com.example.demo_servlet.Controllers.Product;

import com.example.demo_servlet.Entities.Product;
import com.example.demo_servlet.Services.ProductService;
import com.example.demo_servlet.Services.SubCategoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

@WebServlet(name = "AddProductController", value = "/Product/AddController")
@MultipartConfig
public class AddController extends HttpServlet {
    private ProductService productService = new ProductService();
    private SubCategoryService subCategoryService = new SubCategoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("subcategories", subCategoryService.getAll());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/product/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        int categoryId = Integer.parseInt(req.getParameter("category_id"));
        InputStream fileContent = null;
        OutputStream out = null;
        String uploadDirName = "image";
        String absolutePath = req.getServletContext().getRealPath("");
        String savePath = absolutePath + File.separator + uploadDirName;
        File imageSaveDirectory = new File(savePath);
        if (!imageSaveDirectory.exists()) {
            imageSaveDirectory.mkdir();
        }
        try {
            Part filePart = req.getPart("image");
            String fileName = filePart.getSubmittedFileName();
            out = new FileOutputStream(new File(savePath + File.separator + fileName));
            fileContent = filePart.getInputStream();
            int read = 0;
            final byte[] bytes = new byte[1024];
            while ((read = fileContent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            Product product = new Product(name, price, fileName, categoryId, 1);
            System.out.println(name + product.toString());
            boolean result = productService.add(product);
            if (result) {
                resp.sendRedirect("AddController");
            } else {
                req.getRequestDispatcher("/error.jsp").forward(req, resp);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
