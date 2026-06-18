//DEPS com.opencsv:opencsv:5.9
import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvWrite {
  public static void main(String[] args) throws Exception {
    // OpenCSV's default CSVWriter quotes every field. Build it with
    // NO_QUOTE_CHARACTER + NO_ESCAPE_CHARACTER and a "\n" line end so simple
    // fields stay unquoted, matching the other languages' CSV writers.
    StringWriter sw = new StringWriter();
    CSVWriter writer = new CSVWriter(sw, ',',
        CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.NO_ESCAPE_CHARACTER, "\n");
    writer.writeNext(new String[]{"name", "age"});
    writer.writeNext(new String[]{"Alice", "30"});
    writer.close();

    // Normalize \r\n -> \n and strip the trailing newline.
    String csv = sw.toString().replace("\r\n", "\n").replaceAll("\n+$", "");
    System.out.println(csv);
  }
}
