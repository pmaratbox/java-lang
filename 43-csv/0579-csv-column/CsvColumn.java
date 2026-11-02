//JAVA 26
// Java — OpenCSV via jbang. Run: jbang CsvColumn.java
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
  var rows = new CSVReader(new StringReader(data)).readAll();

  // Find the "age" column index from the header row.
  var header = rows.get(0);
  var ageIdx = Arrays.asList(header).indexOf("age");

  var sj = new StringJoiner(",");
  for (var i = 1; i < rows.size(); i++) sj.add(rows.get(i)[ageIdx]);
  System.out.println(sj);   // 30,25,35
}
