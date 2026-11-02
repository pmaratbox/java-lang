//JAVA 26
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var data = "a;b;c\n1;2;3\n";
  var reader = new CSVReaderBuilder(new StringReader(data))
      .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
      .build();
  var rows = reader.readAll();
  System.out.println(String.join(",", rows.get(1)));   // 1,2,3
}
