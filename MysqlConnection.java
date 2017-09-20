
import java.sql.*;
import javax.swing.*;

/**
 * Created by wojciechkuczer on 08/09/2017.
 */
public class MysqlConnection {

    private static Connection conn = null;

    public static Connection ConnectDB(){

        try {
            // loading driver
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/EmployeeBD","root","root");
            //uncomment if need pop up window with sucesfull connection message
            //JOptionPane.showMessageDialog(null, "Connection Succesful");
            
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}