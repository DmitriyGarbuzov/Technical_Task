package dao;


import dao.connection.ConnectionSingleton;
import dao.entity.Department;
import dao.interfaces.DaoDeparts;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 18.11.2014.
 */
public class DepartDaoImpl implements DaoDeparts {

    private static final String ID = "id_dep";
    private static final String DATA = "d_data";
    private static final String NAME = "d_name";
    private static final String EMAIL = "d_email";

    protected  Connection connection;

    public DepartDaoImpl() {
        connection = ConnectionSingleton.getConnection();
    }

    private Department getFromRS(ResultSet resultSet) {

        Department result = new Department();
        try {

            result.setId(resultSet.getInt(ID));
            result.setData(resultSet.getString(DATA));
            result.setName(resultSet.getString(NAME));
            result.setEmail(resultSet.getString(EMAIL));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }


    public List<Department> getAll() {
        List<Department> departments = new ArrayList<Department>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT *FROM departments");

            while (resultSet.next()) {
                departments.add(getFromRS(resultSet));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }


    public void delete(String par) {

        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM departments WHERE d_name=?");
            ps.setString(1, par);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void update(int id_dep, String d_data, String d_name, String d_email) {
        try {
            PreparedStatement ps;
            ps = connection.prepareStatement("UPDATE departments SET D_DATA=?, D_NAME=?, D_EMAIL=? WHERE ID_DEP=?");
            ps.setString(1, d_data);
            ps.setString(2, d_name);
            ps.setString(3, d_email);
            ps.setInt(4, id_dep);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void add(String d_data, String d_name, String d_email) {
        try {
            PreparedStatement ps;
            ps = connection.prepareStatement("INSERT INTO departments (D_DATA,D_NAME,D_EMAIL) VALUES (?,?,?)");
            ps.setString(1, d_data);
            ps.setString(2, d_name);
            ps.setString(3, d_email);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
