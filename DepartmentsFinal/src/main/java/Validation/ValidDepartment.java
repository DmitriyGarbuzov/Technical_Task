package Validation;

import dao.DepartDaoImpl;
import dao.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28.02.2015.
 */
public class ValidDepartment {

    public static boolean isValidName(String name) {

        DepartDaoImpl departDao = new DepartDaoImpl();

        List<Department> departments ;

        departments = departDao.getAll();

        boolean flag = false;

        for(Department department : departments) {

            if (!department.getName().equalsIgnoreCase(name)) {

                flag = true;

            }
        }
        return flag;
    }

    public  static boolean isValidEmail(String email) {

        DepartDaoImpl departDao = new DepartDaoImpl();

        List<Department> departments ;

        departments = departDao.getAll();

        boolean flag = false;

        for(Department department : departments) {

            if (!department.getEmail().equalsIgnoreCase(email)) {

                flag = true;

            }
        }
        return flag;
    }
}
