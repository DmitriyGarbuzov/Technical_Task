package dao.entity;

/**
 * Created by User on 18.11.2014.
 */
public class Worker {
    private int id;
    private int departId;
    private String data;
    private String name;
    private String email;

    public Worker(){}

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

    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    public String toString(){
        return "Worker [id=" + id + ", data=" + data + ", name=" + name + ", email=" +email+ "]";
    }
}
