//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import java.sql.*;
public class Indexes { public static void main(String[] a) throws Exception {
  Connection c = DriverManager.getConnection("jdbc:sqlite::memory:");
  c.createStatement().execute("create table products(id integer, sku text, price integer)");
  PreparedStatement ins = c.prepareStatement("insert into products values(?,?,?)");
  String[] skus = {"A","B","C"};
  int[] prices = {100,200,300};
  for (int i=0;i<3;i++){ ins.setInt(1,i+1); ins.setString(2,skus[i]); ins.setInt(3,prices[i]); ins.executeUpdate(); }
  c.createStatement().execute("create index idx_sku on products(sku)");
  PreparedStatement sel = c.prepareStatement("select price from products where sku=?");
  sel.setString(1,"B");
  ResultSet rs = sel.executeQuery();
  while(rs.next()) System.out.println(rs.getInt(1));
}}
