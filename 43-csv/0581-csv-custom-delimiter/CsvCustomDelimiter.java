//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvCustomDelimiter {
  public static void main(String[] args) throws Exception {
    String data = "a;b;c\n1;2;3\n";
    CSVReader reader = new CSVReaderBuilder(new StringReader(data))
        .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
        .build();
    List<String[]> rows = reader.readAll();
    System.out.println(String.join(",", rows.get(1)));   // 1,2,3
  }
}
