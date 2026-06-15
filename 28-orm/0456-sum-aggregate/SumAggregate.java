//DEPS org.jooq:jooq:3.19.15
//DEPS org.xerial:sqlite-jdbc:3.46.1.3

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static org.jooq.impl.DSL.*;
import java.sql.*;

public class SumAggregate {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:sqlite::memory:");
        DSLContext db = DSL.using(con, SQLDialect.SQLITE);
        db.execute("create table users(id integer primary key, name text, age integer)");
        db.insertInto(table("users"), field("id"), field("name"), field("age"))
          .values(1, "alice", 30)
          .values(2, "bob", 25)
          .values(3, "carol", 35)
          .execute();
        int total = db.select(sum(field("age", Integer.class)))
                      .from("users")
                      .fetchOne(0, int.class);
        System.out.println(total);
    }
}
