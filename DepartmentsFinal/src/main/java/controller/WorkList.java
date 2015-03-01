package controller;

import dao.entity.Worker;
import dao.WorkerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 12.12.2014.
 */
@WebServlet("/WorkList")
public class WorkList extends HttpServlet {

    private WorkerDaoImpl workerDaoImpl;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        super.doPost(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        WorkerDaoImpl workerDaoImpl = new WorkerDaoImpl();

        String idDepS=request.getParameter("param1");

        int id_depart=Integer.parseInt(idDepS);

        List<Worker> workersList = new ArrayList<Worker>();
        try {
            workersList = workerDaoImpl.getAll(id_depart);
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("workers", workersList);
        request.getRequestDispatcher("/WorkList.jsp").forward(request,response);

    }
}
