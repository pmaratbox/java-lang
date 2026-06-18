//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvParse {
  public static void main(String[] a) throws Exception {
    String data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
    List<String[]> rows = new CSVReader(new StringReader(data)).readAll();
    StringJoiner sj = new StringJoiner(",");
    for (int i = 1; i < rows.size(); i++) sj.add(rows.get(i)[0]);
    System.out.println(sj);
  }
}
