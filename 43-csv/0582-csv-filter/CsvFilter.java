//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvFilter {
  public static void main(String[] args) throws Exception {
    String data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
    List<String[]> rows = new CSVReader(new StringReader(data)).readAll();

    // Keep data rows where age > 28, collect their names.
    StringJoiner names = new StringJoiner(",");
    for (int i = 1; i < rows.size(); i++) {
      String[] row = rows.get(i);
      int age = Integer.parseInt(row[1]);
      if (age > 28) names.add(row[0]);
    }
    System.out.println(names);   // Alice,Carol
  }
}
