//DEPS org.jooq:jooq:3.19.15
//DEPS org.xerial:sqlite-jdbc:3.46.1.3
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static org.jooq.impl.DSL.*;
import java.sql.*;
public class Join {
  public static void main(String[] a) throws Exception {
    Connection con = DriverManager.getConnection("jdbc:sqlite::memory:");
    DSLContext db = DSL.using(con, SQLDialect.SQLITE);
    db.execute("create table users(id integer primary key, name text)");
    db.execute("create table posts(id integer primary key, user_id integer, title text)");
    db.insertInto(table("users"), field("id"), field("name"))
      .values(1, "alice").values(2, "bob").execute();
    db.insertInto(table("posts"), field("id"), field("user_id"), field("title"))
      .values(1, 1, "hello").values(2, 1, "world").values(3, 2, "hi").execute();
    Result<? extends org.jooq.Record> r = db
      .select(field("users.name"), field("posts.title"))
      .from(table("posts"))
      .join(table("users")).on(field("users.id").eq(field("posts.user_id")))
      .orderBy(field("users.name"), field("posts.title"))
      .fetch();
    for (org.jooq.Record rec : r)
      System.out.println(rec.get(0, String.class) + " " + rec.get(1, String.class));
  }
}
