//JAVA 26
//DEPS org.xerial:sqlite-jdbc:3.46.1.3

import java.sql.*;

void main() throws Exception {
    var c = DriverManager.getConnection("jdbc:sqlite::memory:");
    var rs = c.createStatement().executeQuery("select 42");
    while (rs.next()) System.out.println(rs.getInt(1));
}
