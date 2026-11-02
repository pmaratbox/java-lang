//JAVA 26
//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var data = "name,note\nAlice,\"hello, world\"\n";
  var rows = new CSVReader(new StringReader(data)).readAll();
  // rows.get(0) = header [name, note]; rows.get(1) = data row [Alice, "hello, world"].
  // OpenCSV strips the surrounding quotes and keeps the embedded comma intact.
  var note = rows.get(1)[1];
  System.out.println(note);   // hello, world
}
