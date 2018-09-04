package connection;

/**
 * Created by admin on 03.09.2018.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/library?useUnicode=true&characterEncoding=utf-8&serverTimezone=Europe/Kiev&useSSL=false";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "1996seas";

    public static void main(String[] args) {
        Connection connection;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            System.out.println("Connection is ok");
        }
        catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            System.out.println("Connection ERROR");
        }


    }
}

