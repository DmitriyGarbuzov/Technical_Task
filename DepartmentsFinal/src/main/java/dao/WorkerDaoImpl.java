package dao;

import dao.connection.ConnectionSingleton;
import dao.entity.Worker;
import dao.interfaces.DaoWorkers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 19.11.2014.
 */
public class WorkerDaoImpl implements DaoWorkers {

    private  Connection connection;

    public WorkerDaoImpl() {
        connection = ConnectionSingleton.getConnection();
    }

    private Worker getFromRS(ResultSet resultSet) {

        Worker result = new Worker();
        try {
            result.setDepartId(resultSet.getInt("id_depart"));
            result.setId(resultSet.getInt("id_w"));
            result.setData(resultSet.getString("w_data"));
            result.setName(resultSet.getString("w_name"));
            result.setEmail(resultSet.getString("w_email"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public List<Worker> getAll(int id_depart) {
        List<Worker> workers = new ArrayList<Worker>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM WORKERS WHERE ID_DEPART=" + id_depart);
            while (resultSet.next()) {
                workers.add(getFromRS(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return workers;
    }

    public List<Worker> getAll() {

        List<Worker> workers = new ArrayList<Worker>();

        try {

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM WORKERS");

            while (resultSet.next()) {

                workers.add(getFromRS(resultSet));

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return workers;
    }


    public void delete(String name) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM WORKERS WHERE W_NAME=?");
            ps.setString(1, name);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void update(int id, String data, String name, String email) {
        try {
            PreparedStatement ps;
            ps = connection.prepareStatement("UPDATE WORKERS SET W_DATA=?, W_NAME=?, W_EMAIL=? WHERE ID_W=?");
            ps.setInt(4, id);
            ps.setString(1, data);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void add(int departId, String data, String name, String email) {
        try {
            PreparedStatement ps;
            ps = connection.prepareStatement("INSERT INTO WORKERS (ID_DEPART,W_DATA,W_NAME,W_EMAIL) VALUES (?,?,?,?)");
            ps.setInt(1, departId);
            ps.setString(2, data);
            ps.setString(3, name);
            ps.setString(4, email);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
