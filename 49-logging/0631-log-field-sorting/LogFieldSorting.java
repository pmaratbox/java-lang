// slf4j 2 fluent API + logback ListAppender (in-memory record capture). Run: jbang LogFieldSorting.java
//DEPS org.slf4j:slf4j-api:2.0.16
//DEPS ch.qos.logback:logback-classic:1.5.12
// Use FULLY-QUALIFIED ch.qos.logback.classic.Logger to avoid ambiguity with org.slf4j.Logger.
// CALL root.detachAndStopAllAppenders() FIRST so nothing prints to the console.
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import java.util.*;
import java.util.stream.*;

public class LogFieldSorting {
  public static void main(String[] a) {
    ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger)
        org.slf4j.LoggerFactory.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME);
    root.detachAndStopAllAppenders();                 // silence the default console appender
    ListAppender<ILoggingEvent> app = new ListAppender<>(); app.start();
    root.addAppender(app);
    root.setLevel(ch.qos.logback.classic.Level.INFO);

    org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger("demo");
    // Fields attached in NON-alphabetical order; normalization sorts them by key.
    log.atInfo().setMessage("metric").addKeyValue("zeta", 2).addKeyValue("alpha", 1).log();

    for (ILoggingEvent e : app.list) {
      String level = e.getLevel().toString().toLowerCase();  // INFO -> info
      List<org.slf4j.event.KeyValuePair> kv = e.getKeyValuePairs();
      String fields = (kv == null) ? "" :
          kv.stream().sorted(Comparator.comparing(k -> k.key))
            .map(k -> "|" + k.key + "=" + k.value).collect(Collectors.joining());
      System.out.println(level + "|" + e.getFormattedMessage() + fields);
    }
  }
}
