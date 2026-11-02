//JAVA 26
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
void main() throws Exception {
 var c = DriverManager.getConnection("jdbc:sqlite::memory:");
 c.createStatement().execute("create table t(amount integer)");
 var ins = c.prepareStatement("insert into t values(?)");
 int[] amounts = {10,20,30,40,50};
 for (var amount : amounts){ ins.setInt(1,amount); ins.executeUpdate(); }
 var rs = c.createStatement().executeQuery(
   "select count(*),sum(amount),min(amount),max(amount) from t");
 rs.next();
 IO.println(rs.getInt(1));
 IO.println(rs.getInt(2));
 IO.println(rs.getInt(3));
 IO.println(rs.getInt(4));
}
