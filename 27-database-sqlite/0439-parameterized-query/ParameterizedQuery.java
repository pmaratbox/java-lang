//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class ParameterizedQuery { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table users(id integer, name text)");
  PreparedStatement ins = c.prepareStatement("insert into users values(?,?)");
  String[] names = {"alice","bob","carol"};
  for (int i=0;i<3;i++){ ins.setInt(1,i+1); ins.setString(2,names[i]); ins.executeUpdate(); }
  PreparedStatement sel = c.prepareStatement("select name from users where id=?");
  sel.setInt(1,2);
  ResultSet rs = sel.executeQuery();
  while(rs.next()) System.out.println(rs.getString(1));
}}
