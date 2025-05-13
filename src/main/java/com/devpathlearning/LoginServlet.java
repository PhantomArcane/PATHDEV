package com.devpathlearning;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentNumber = request.getParameter("studentNumber");
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String semester = request.getParameter("semester");

        // For now, redirect to dashboard (no authentication logic yet)
        response.sendRedirect("dashboard.html");
    }
}
