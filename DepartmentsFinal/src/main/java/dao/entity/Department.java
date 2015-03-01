package dao.entity;


/**
 * Created by User on 17.11.2014.
 */
public class Department {
    private int id;
    private String data;
    private String name;
    private String email;

    public Department(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Department [id=" + id + ", data=" + data + ", name=" + name + ", email="
                + email + "]";
    }

}



