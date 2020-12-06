import java.sql.*;

public class GenerateBoot {

        public static void main(String[] args) {

        try {
            Class.forName("org.hsqldb.jdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from employee");
            String dbtime;
            while (rs.next()) {
                dbtime = rs.getString(1);
                System.out.println(dbtime);
            }

            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }




}
