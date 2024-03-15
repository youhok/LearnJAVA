package ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class testConnect {
    public static void main(String[] args) {
        try {

            String sDriverName = "org.sqlite.JDBC";

            Class.forName(sDriverName);

            Connection conn = null;

            String DB_URL = "jdbc:sqlite:dict.db";

            conn = DriverManager.getConnection(DB_URL);

            Statement st = conn.createStatement();

            String sql = "SELECT * FROM Items";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
 
                System.out.println("word: " + rs.getString("word"));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
   
}
