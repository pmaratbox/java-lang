//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;
public class ElementwiseAdd { public static void main(String[] x) {
    SimpleMatrix a = new SimpleMatrix(new double[][]{{1, 2, 3}});
    SimpleMatrix b = new SimpleMatrix(new double[][]{{10, 20, 30}});
    SimpleMatrix c = a.plus(b);
    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < c.getNumCols(); j++) {
        if (j > 0) sb.append(" ");
        sb.append((int) Math.round(c.get(0, j)));
    }
    System.out.println(sb);
}}
