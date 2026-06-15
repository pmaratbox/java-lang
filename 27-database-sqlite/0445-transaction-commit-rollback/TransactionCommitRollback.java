//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class TransactionCommitRollback { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table t(n integer)");

  // First transaction: insert 1 and 2, then commit.
  c.setAutoCommit(false);
  c.createStatement().execute("insert into t(n) values(1)");
  c.createStatement().execute("insert into t(n) values(2)");
  c.commit();

  // Second transaction: insert 3, then roll back.
  c.createStatement().execute("insert into t(n) values(3)");
  c.rollback();
  c.setAutoCommit(true);

  ResultSet rs = c.createStatement().executeQuery("select n from t order by n");
  while(rs.next()) System.out.println(rs.getInt(1));
}}
