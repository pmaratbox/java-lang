// Java — OpenCSV via jbang. Run: jbang CsvColumn.java
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvColumn {
  public static void main(String[] a) throws Exception {
    String data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
    List<String[]> rows = new CSVReader(new StringReader(data)).readAll();

    // Find the "age" column index from the header row.
    String[] header = rows.get(0);
    int ageIdx = Arrays.asList(header).indexOf("age");

    StringJoiner sj = new StringJoiner(",");
    for (int i = 1; i < rows.size(); i++) sj.add(rows.get(i)[ageIdx]);
    System.out.println(sj);   // 30,25,35
  }
}
