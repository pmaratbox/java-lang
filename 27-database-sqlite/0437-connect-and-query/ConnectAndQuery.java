//DEPS org.xerial:sqlite-jdbc:3.46.1.3

import java.sql.*;

public class ConnectAndQuery {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
        ResultSet rs = c.createStatement().executeQuery("select 42");
        while (rs.next()) System.out.println(rs.getInt(1));
    }
}
