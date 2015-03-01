package dao.interfaces;


import dao.entity.Department;

import java.util.List;

public interface DaoDeparts {

    public List<Department> getAll();

    public void delete(String name);

    public void update(int id, String data, String name, String email);

    public void add(String data, String name, String email);
}
