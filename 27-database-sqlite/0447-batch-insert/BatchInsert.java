//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class BatchInsert { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table t(n integer)");
  c.setAutoCommit(false);
  PreparedStatement ins = c.prepareStatement("insert into t values(?)");
  for (int i=1;i<=1000;i++){ ins.setInt(1,i); ins.addBatch(); }
  ins.executeBatch();
  c.commit();
  ResultSet rs = c.createStatement().executeQuery("select count(*) from t");
  rs.next();
  System.out.println(rs.getInt(1));
}}
