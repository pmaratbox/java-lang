//JAVA 26
// Java — OpenCSV via jbang. Run: jbang CsvHeaders.java
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
  var rows = new CSVReader(new StringReader(data)).readAll();
  var header = rows.get(0);
  System.out.println(String.join("|", header));   // name|age|city
}
