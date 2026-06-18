//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvQuotedFields {
  public static void main(String[] a) throws Exception {
    String data = "name,note\nAlice,\"hello, world\"\n";
    List<String[]> rows = new CSVReader(new StringReader(data)).readAll();
    // rows.get(0) = header [name, note]; rows.get(1) = data row [Alice, "hello, world"].
    // OpenCSV strips the surrounding quotes and keeps the embedded comma intact.
    String note = rows.get(1)[1];
    System.out.println(note);   // hello, world
  }
}
