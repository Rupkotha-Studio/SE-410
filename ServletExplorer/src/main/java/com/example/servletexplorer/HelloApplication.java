package com.example.servletexplorer;

import jakarta.servlet.Servlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(value = "/hello-servlet")
public class HelloApplication extends HttpServlet {
    private String message;
    static int count=0,c2=0;
    public void init() {
        message = "Hello World!";
        message=new Date().toString();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Cookie c1=new Cookie("count",String.valueOf(count));
        c2=Integer.parseInt(c1.getValue());
        // Hello
        PrintWriter out = response.getWriter();
        String name=request.getParameter("t1");
        if(c2==0)
            count++;
        else
        {
            c1=new Cookie("count",String.valueOf(count));
            count++;
           // out.println("Welcome="+name+"\t"+count);
        }
        out.println("<html><body>");
        out.println("<h1><center>" + message + "</center></h1>");
        out.println("<h1><center>"+ "Visited Number Of Time: "+ c2 + "</center></h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}