package com.xiaohui.web;

import com.xiaohui.pojo.Brand;
import com.xiaohui.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectAllServlet")
public class SelectAllServlet extends HttpServlet {

    BrandService service = new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Brand> brands = service.selectAll();
        request.setAttribute("brands",brands);
        request.getRequestDispatcher("/brand.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
