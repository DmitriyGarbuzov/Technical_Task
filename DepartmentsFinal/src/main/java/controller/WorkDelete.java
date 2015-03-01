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
@WebServlet("/WorkDelete")
public class WorkDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WorkerDaoImpl workerDaoImpl = new WorkerDaoImpl();

        String name = request.getParameter("nameWorker");
        workerDaoImpl.delete(name);

        request.getRequestDispatcher("/Success.jsp").forward(request,response);
    }
}
