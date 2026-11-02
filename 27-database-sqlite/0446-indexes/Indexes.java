//JAVA 26
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
void main() throws Exception {
 var c = DriverManager.getConnection("jdbc:sqlite::memory:");
 c.createStatement().execute("create table products(id integer, sku text, price integer)");
 var ins = c.prepareStatement("insert into products values(?,?,?)");
 String[] skus = {"A","B","C"};
 int[] prices = {100,200,300};
 for (var i=0;i<3;i++){ ins.setInt(1,i+1); ins.setString(2,skus[i]); ins.setInt(3,prices[i]); ins.executeUpdate(); }
 c.createStatement().execute("create index idx_sku on products(sku)");
 var sel = c.prepareStatement("select price from products where sku=?");
 sel.setString(1,"B");
 var rs = sel.executeQuery();
 while(rs.next()) IO.println(rs.getInt(1));
}
