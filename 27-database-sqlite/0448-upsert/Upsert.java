//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class Upsert { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table inv(item text primary key, qty integer)");
  c.createStatement().execute("insert into inv values('apple',5)");
  PreparedStatement up = c.prepareStatement(
    "insert into inv values(?,?) on conflict(item) do update set qty=qty+excluded.qty");
  up.setString(1,"apple"); up.setInt(2,5); up.executeUpdate();
  up.setString(1,"banana"); up.setInt(2,3); up.executeUpdate();
  ResultSet rs = c.createStatement().executeQuery("select item,qty from inv order by item");
  while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getInt(2));
}}
