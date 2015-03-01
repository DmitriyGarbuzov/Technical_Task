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
@WebServlet("/WorkEdit")
public class WorkEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        WorkerDaoImpl workerDaoImpl =new WorkerDaoImpl();
        int id=Integer.parseInt(request.getParameter("idW"));
        String data=request.getParameter("dataW");
        String name= request.getParameter("nameW");
        String email=request.getParameter("emailW");
        workerDaoImpl.update(id, data, name, email);
        request.getRequestDispatcher("/Success.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }
}
