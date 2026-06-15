//DEPS org.jooq:jooq:3.19.15
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static org.jooq.impl.DSL.*;
import java.sql.*;

public class Limit {
  public static void main(String[] a) throws Exception {
    Connection con = DriverManager.getConnection("jdbc:sqlite::memory:");
    DSLContext db = DSL.using(con, SQLDialect.SQLITE);
    db.execute("create table users(id integer primary key, name text, age integer)");

    db.insertInto(table("users"), field("id"), field("name"), field("age"))
      .values(1, "alice", 30)
      .values(2, "bob", 25)
      .values(3, "carol", 35)
      .execute();

    Result<org.jooq.Record> r = db.select()
      .from(table("users"))
      .orderBy(field("age").desc())
      .limit(2)
      .fetch();

    for (org.jooq.Record rec : r) System.out.println(rec.get("name", String.class));
  }
}
