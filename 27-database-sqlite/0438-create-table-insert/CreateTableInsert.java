//DEPS org.xerial:sqlite-jdbc:3.46.1.3

import java.sql.*;

public class CreateTableInsert {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
        c.createStatement().execute("create table users(id integer, name text)");
        PreparedStatement ins = c.prepareStatement("insert into users values(?,?)");
        String[] names = {"alice", "bob", "carol"};
        for (int i = 0; i < names.length; i++) {
            ins.setInt(1, i + 1);
            ins.setString(2, names[i]);
            ins.executeUpdate();
        }
        ResultSet rs = c.createStatement().executeQuery("select name from users order by id");
        while (rs.next()) System.out.println(rs.getString(1));
    }
}
