package ConnectToDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class updateDB {
    public static void main(String[] args) {
        try {

            String sDriverName = "org.sqlite.JDBC";

            Class.forName(sDriverName);

            Connection conn = null;

            String DB_URL = "jdbc:sqlite:dict.db";

            conn = DriverManager.getConnection(DB_URL);

            Statement st = conn.createStatement();

            String sql = "DELETE FROM Items WHERE id =1";

            st.executeUpdate(sql);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
