package kz.bitlab.sp_task2.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.sp_task2.db.DBConnection;
import kz.bitlab.sp_task2.db.DBManager;
import kz.bitlab.sp_task2.db.Users;

import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        String password=req.getParameter("password");

        boolean check = DBConnection.login(email,password);
        if(check){
            req.getRequestDispatcher("profile.jsp").forward(req, resp);
        }else{
            req.setAttribute("error","Incorrect email and password");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
