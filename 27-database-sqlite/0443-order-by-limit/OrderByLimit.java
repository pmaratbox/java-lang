//JAVA 26
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
void main() throws Exception {
 var c = DriverManager.getConnection("jdbc:sqlite::memory:");
 c.createStatement().execute("create table scores(value integer)");
 var ins = c.prepareStatement("insert into scores values(?)");
 int[] values = {50,90,70,30,100,20};
 for (var v : values){ ins.setInt(1,v); ins.executeUpdate(); }
 var rs = c.createStatement().executeQuery("select value from scores order by value desc limit 3");
 while(rs.next()) System.out.println(rs.getInt(1));
}
