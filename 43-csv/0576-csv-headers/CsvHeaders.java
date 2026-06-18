// Java — OpenCSV via jbang. Run: jbang CsvHeaders.java
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvHeaders {
  public static void main(String[] a) throws Exception {
    String data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
    List<String[]> rows = new CSVReader(new StringReader(data)).readAll();
    String[] header = rows.get(0);
    System.out.println(String.join("|", header));   // name|age|city
  }
}
