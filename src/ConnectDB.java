import java.sql.*;
import javax.swing.*;

public class ConnectDB {
    public static Connection ConnectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/Restauracia?useUnicode=true&characterEncoding=UTF-8", "root", "pass");
            return conn;
        }
        catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}