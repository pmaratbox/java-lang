//DEPS org.jooq:jooq:3.19.15
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static org.jooq.impl.DSL.*;
import java.sql.*;
public class GroupBy {
  public static void main(String[] a) throws Exception {
    Connection con = DriverManager.getConnection("jdbc:sqlite::memory:");
    DSLContext db = DSL.using(con, SQLDialect.SQLITE);
    db.execute("create table products(id integer primary key, category text, price integer)");
    db.insertInto(table("products"), field("id"), field("category"), field("price"))
      .values(1, "a", 10).values(2, "b", 20).values(3, "a", 30).execute();
    Result<?> r = db.select(field("category"), sum(field("price", Integer.class)).as("total"))
      .from("products")
      .groupBy(field("category"))
      .orderBy(field("category"))
      .fetch();
    for (org.jooq.Record rec : r)
      System.out.println(rec.get("category", String.class) + " " + rec.get("total", Integer.class));
  }
}
