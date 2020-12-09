package com.bjpowernode.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.通过请求对象向Tomcat索要当前网站全局作用域对象
        ServletContext application = request.getServletContext();
        //2.将数据添加到全局作用域对象，作为共享数据
        application.setAttribute("key1", 100);
    }
}
