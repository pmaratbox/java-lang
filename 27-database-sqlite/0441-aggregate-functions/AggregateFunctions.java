//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class AggregateFunctions { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table t(amount integer)");
  PreparedStatement ins = c.prepareStatement("insert into t values(?)");
  int[] amounts = {10,20,30,40,50};
  for (int amount : amounts){ ins.setInt(1,amount); ins.executeUpdate(); }
  ResultSet rs = c.createStatement().executeQuery(
    "select count(*),sum(amount),min(amount),max(amount) from t");
  rs.next();
  System.out.println(rs.getInt(1));
  System.out.println(rs.getInt(2));
  System.out.println(rs.getInt(3));
  System.out.println(rs.getInt(4));
}}
