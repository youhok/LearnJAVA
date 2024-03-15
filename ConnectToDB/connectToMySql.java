package ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectToMySql {
    String DB_URL = "jdbc:mysql://localhost/DB_NAME";

        String USER = "root";

        String PASS = "";

public static void main(String[] args) {
    try {

        String sDriverName = "com.mysql.jdbc.Driver";

        Class.forName(sDriverName);

        Connection conn = null;

        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement st = conn.createStatement();

        String sql = "SELECT * FROM Items";

        st.executeUpdate(sql);

    } catch (Exception e) {

        e.printStackTrace();

    }
}        
}
