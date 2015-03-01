package dao.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*-----------------------------------------*/
/**Class that Create a thread safe Singleton connection to our DataBase
 * You can change Data Base in ConstConnection
 * @author <garbuzov.dmitriy@bk.ru>
 */
public final class ConnectionSingleton  {

    private static Connection connection;

    private ConnectionSingleton(){}
 /*----------------------------------------*/
/**
 *
 */
    static  {
        try {
            Class.forName(ConstConnection.DB_DRIVER);
            connection = DriverManager.getConnection(ConstConnection.DB_URL, ConstConnection.DB_USER_NAME, ConstConnection.DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*---------------------------------------*/
    /**The method which
     * @return connection to Database
     */
    public static synchronized Connection getConnection() {

        return connection;
    }

}
