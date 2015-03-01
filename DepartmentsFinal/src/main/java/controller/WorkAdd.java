package controller;

import dao.WorkerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 12.12.2014.
 */
@WebServlet("/WorkAdd")
public class WorkAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        WorkerDaoImpl workerDaoImpl = new WorkerDaoImpl();

        int id=Integer.parseInt(request.getParameter("id"));

        String data=request.getParameter("wData");
        String name=request.getParameter("wName");
        String email=request.getParameter("wEmail");

        workerDaoImpl.add(id, data, name, email);

        request.getRequestDispatcher("/Success.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request,response);
    }
}
