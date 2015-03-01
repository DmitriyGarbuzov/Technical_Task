package Validation;



import dao.WorkerDaoImpl;
import dao.entity.Worker;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28.02.2015.
 */
public class ValidWorker {

    public static boolean isValidName(String name) {

        WorkerDaoImpl workerDao = new WorkerDaoImpl();

        List<Worker> workers ;

        workers = workerDao.getAll();

        boolean flag = false;

        for(Worker worker : workers) {

            if (!worker.getName().equalsIgnoreCase(name)) {

                flag = true;

            }
        }
        return flag;
    }

    public  static boolean isValidEmail(String email) {

        WorkerDaoImpl workerDao = new WorkerDaoImpl();

        List<Worker> workers ;

        workers = workerDao.getAll();

        boolean flag = false;

        for(Worker worker : workers) {

            if (!worker.getEmail().equalsIgnoreCase(email)) {

                flag = true;

            }
        }
        return flag;
    }
}
