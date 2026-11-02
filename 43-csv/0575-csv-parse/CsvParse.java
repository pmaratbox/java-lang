//JAVA 26
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var data = "name,age,city\nAlice,30,Paris\nBob,25,London\nCarol,35,Berlin\n";
  var rows = new CSVReader(new StringReader(data)).readAll();
  var sj = new StringJoiner(",");
  for (var i = 1; i < rows.size(); i++) sj.add(rows.get(i)[0]);
  IO.println(sj);
}
