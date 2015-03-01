package dao.interfaces;

import dao.entity.Worker;

import java.util.List;

/**
 * Created by User on 18.11.2014.
 */
public interface DaoWorkers {


    public List<Worker> getAll(int departId);

    public List<Worker> getAll();

    public void delete(String name);

    public void update(int id, String data, String name, String email);

    public void add(int departId, String data, String name, String email);
}
