//DEPS org.xerial:sqlite-jdbc:3.46.1.3

import java.sql.*;

public class UpdateDelete {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
        c.createStatement().execute("create table users(id integer, name text)");
        PreparedStatement ins = c.prepareStatement("insert into users values(?,?)");
        String[] names = {"alice", "bob", "carol"};
        for (int i = 0; i < 3; i++) {
            ins.setInt(1, i + 1);
            ins.setString(2, names[i]);
            ins.executeUpdate();
        }
        c.createStatement().execute("update users set name='robert' where id=2");
        c.createStatement().execute("delete from users where id=1");
        ResultSet rs = c.createStatement().executeQuery("select id,name from users order by id");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }
}
