//JAVA 26
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
  var rows = new CSVReader(new StringReader(data)).readAll();

  // Keep data rows where age > 28, collect their names.
  var names = new StringJoiner(",");
  for (var i = 1; i < rows.size(); i++) {
    var row = rows.get(i);
    var age = Integer.parseInt(row[1]);
    if (age > 28) names.add(row[0]);
  }
  IO.println(names);   // Alice,Carol
}
