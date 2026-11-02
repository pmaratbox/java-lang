//JAVA 26
//DEPS org.xerial:sqlite-jdbc:3.46.1.3

import java.sql.*;

void main() throws Exception {
    var c = DriverManager.getConnection("jdbc:sqlite::memory:");
    c.createStatement().execute("create table users(id integer, name text)");
    var ins = c.prepareStatement("insert into users values(?,?)");
    String[] names = {"alice", "bob", "carol"};
    for (var i = 0; i < names.length; i++) {
        ins.setInt(1, i + 1);
        ins.setString(2, names[i]);
        ins.executeUpdate();
    }
    var rs = c.createStatement().executeQuery("select name from users order by id");
    while (rs.next()) IO.println(rs.getString(1));
}
