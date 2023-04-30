package kz.bitlab.sp_task2.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.sp_task2.db.DBConnection;
import kz.bitlab.sp_task2.db.DBManager;
import kz.bitlab.sp_task2.db.Items;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Items> items= DBConnection.getItems();
        req.setAttribute("items",items);
        req.getRequestDispatcher("mainPage.jsp").forward(req,resp);
    }
}
