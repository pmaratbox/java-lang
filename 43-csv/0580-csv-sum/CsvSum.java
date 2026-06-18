//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvSum {
  public static void main(String[] args) throws Exception {
    String data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
    List<String[]> rows = new CSVReader(new StringReader(data)).readAll();
    String[] header = rows.get(0);
    int ageCol = Arrays.asList(header).indexOf("age");
    int sum = 0;
    for (int i = 1; i < rows.size(); i++) {
      sum += Integer.parseInt(rows.get(i)[ageCol].trim());
    }
    System.out.println(sum);  // 90
  }
}
