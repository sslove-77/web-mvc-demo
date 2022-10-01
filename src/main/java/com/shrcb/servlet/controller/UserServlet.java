package com.shrcb.servlet.controller;

import com.shrcb.servlet.entity.User;
import com.shrcb.servlet.service.UserService;
import com.shrcb.servlet.service.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {

    private UserService userService = new UserServiceImp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> user = userService.getUser();
        req.setAttribute("users",user);
        req.getRequestDispatcher("user.jsp").forward(req,resp);
    }
}
