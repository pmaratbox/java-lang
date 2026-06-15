//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class OrderByLimit { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table scores(value integer)");
  PreparedStatement ins = c.prepareStatement("insert into scores values(?)");
  int[] values = {50,90,70,30,100,20};
  for (int v : values){ ins.setInt(1,v); ins.executeUpdate(); }
  ResultSet rs = c.createStatement().executeQuery("select value from scores order by value desc limit 3");
  while(rs.next()) System.out.println(rs.getInt(1));
}}
