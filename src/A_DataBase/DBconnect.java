package A_DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author perer
 */
public class DBconnect {

    public static Connection connect() {

        Connection conn = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/intern_managment_system", "root", "");
            System.out.println("Connected!");

        } catch (Exception e) {

            System.out.println(e);

        }
        return conn;

    }

}
