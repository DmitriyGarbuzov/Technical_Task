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
@WebServlet("/DepartAdd")
public class DepartAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        DepartDaoImpl department = new DepartDaoImpl();
        String departdata=request.getParameter("departdata");
        String departname=request.getParameter("departname");
        String departemail=request.getParameter("departemail");

        department.add(departdata,departname,departemail);

        request.getRequestDispatcher("/Success.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
