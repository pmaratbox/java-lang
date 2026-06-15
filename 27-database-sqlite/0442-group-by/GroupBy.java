//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class GroupBy { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table sales(category text, amount integer)");
  PreparedStatement ins = c.prepareStatement("insert into sales values(?,?)");
  String[] cats = {"a","b","a","b","a"};
  int[] amts = {10,20,30,5,2};
  for (int i=0;i<cats.length;i++){ ins.setString(1,cats[i]); ins.setInt(2,amts[i]); ins.executeUpdate(); }
  ResultSet rs = c.createStatement().executeQuery("select category,sum(amount) from sales group by category order by category");
  while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getInt(2));
}}
