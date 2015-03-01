package controller;


import dao.DepartDaoImpl;
import dao.entity.Department;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 30.11.2014.
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet  {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    super.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DepartDaoImpl departDaoImpl = new DepartDaoImpl();

       List<Department> departmentsList = new ArrayList<Department>();
            try {
                departmentsList= departDaoImpl.getAll();

            }catch (Exception e){
                e.printStackTrace();
            }


         request.setAttribute("depList",departmentsList);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
