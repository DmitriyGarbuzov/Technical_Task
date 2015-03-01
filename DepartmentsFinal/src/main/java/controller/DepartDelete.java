package controller;

import dao.DepartDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 12.12.2014.
 */
@WebServlet("/DepartDelete")
public class DepartDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    super.doPost(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter("param1");
        DepartDaoImpl departments = new DepartDaoImpl();
        departments.delete(parameter);
    request.getRequestDispatcher("/Success.jsp").forward(request, response);
    }
}
