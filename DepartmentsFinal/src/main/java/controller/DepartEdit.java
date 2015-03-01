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
@WebServlet("/DepartEdit")
public class DepartEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DepartDaoImpl department = new DepartDaoImpl();


        int id= Integer.parseInt( request.getParameter("id"));
        String dDataEdit=request.getParameter("dDataEdit");
        String dNameEdit=request.getParameter("dNameEdit");
        String dEmailEdit=request.getParameter("dEmailEdit");

        department.update(id, dDataEdit, dNameEdit, dEmailEdit);

        request.getRequestDispatcher("/Success.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request,response);
    }
}
