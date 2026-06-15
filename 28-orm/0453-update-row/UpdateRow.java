//DEPS org.jooq:jooq:3.19.15
//DEPS org.xerial:sqlite-jdbc:3.46.1.3

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static org.jooq.impl.DSL.*;
import java.sql.*;

public class UpdateRow {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:sqlite::memory:");
        DSLContext db = DSL.using(con, SQLDialect.SQLITE);
        db.execute("create table users(id integer primary key, name text, age integer)");

        db.insertInto(table("users"), field("id"), field("name"), field("age"))
          .values(1, "alice", 30)
          .values(2, "bob", 25)
          .values(3, "carol", 35)
          .execute();

        // Update bob's age to 40 via the jOOQ update DSL.
        db.update(table("users"))
          .set(field("age"), 40)
          .where(field("name").eq("bob"))
          .execute();

        Result<org.jooq.Record> r = db.select()
          .from("users")
          .where(field("age", Integer.class).ge(35))
          .orderBy(field("id"))
          .fetch();
        for (org.jooq.Record rec : r) {
            System.out.println(rec.get("name", String.class) + " " + rec.get("age", Integer.class));
        }
    }
}
