//JAVA 26
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
  var rows = new CSVReader(new StringReader(data)).readAll();
  var header = rows.get(0);
  var ageCol = Arrays.asList(header).indexOf("age");
  var sum = 0;
  for (var i = 1; i < rows.size(); i++) {
    sum += Integer.parseInt(rows.get(i)[ageCol].trim());
  }
  IO.println(sum);  // 90
}
