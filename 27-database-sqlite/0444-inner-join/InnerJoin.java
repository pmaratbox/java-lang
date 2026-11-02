//JAVA 26
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
void main() throws Exception {
 var c = DriverManager.getConnection("jdbc:sqlite::memory:");
 c.createStatement().execute("create table users(id integer, name text)");
 c.createStatement().execute("create table orders(user_id integer, item text)");
 var iu = c.prepareStatement("insert into users values(?,?)");
 Object[][] users = {{1,"alice"},{2,"bob"}};
 for (var u : users){ iu.setInt(1,(int)u[0]); iu.setString(2,(String)u[1]); iu.executeUpdate(); }
 var io = c.prepareStatement("insert into orders values(?,?)");
 Object[][] orders = {{1,"book"},{2,"pen"},{1,"lamp"}};
 for (var o : orders){ io.setInt(1,(int)o[0]); io.setString(2,(String)o[1]); io.executeUpdate(); }
 var rs = c.createStatement().executeQuery(
   "select u.name,o.item from orders o join users u on u.id=o.user_id order by u.name,o.item");
 while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));
}
