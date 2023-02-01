package com.example.servletexplorer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    public LoginServlet() {
      //  super();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.service(req, resp);
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");
        // To verify whether entered data is printing correctly or not
        System.out.println("emailId.." + emailId);
        System.out.println("password.." + password);

        if (emailId != null &&
                emailId.equalsIgnoreCase("da-durjoy@outlook.com") && password != null && password.equalsIgnoreCase("admin")) {
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("emailId", emailId);
            RequestDispatcher rs=req.getRequestDispatcher("welcome.jsp");
            rs.forward(req,resp);
            return;
        }
    }
    @Override
    public void destroy() {
       // super.destroy();
    }
}
