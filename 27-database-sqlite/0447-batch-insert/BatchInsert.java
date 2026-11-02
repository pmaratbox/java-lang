//JAVA 26
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
void main() throws Exception {
 var c = DriverManager.getConnection("jdbc:sqlite::memory:");
 c.createStatement().execute("create table t(n integer)");
 c.setAutoCommit(false);
 var ins = c.prepareStatement("insert into t values(?)");
 for (var i=1;i<=1000;i++){ ins.setInt(1,i); ins.addBatch(); }
 ins.executeBatch();
 c.commit();
 var rs = c.createStatement().executeQuery("select count(*) from t");
 rs.next();
 System.out.println(rs.getInt(1));
}
