//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;
public class Transpose { public static void main(String[] x) {
    SimpleMatrix a = new SimpleMatrix(new double[][]{{1,2,3},{4,5,6}});
    SimpleMatrix t = a.transpose();
    for (int i = 0; i < t.getNumRows(); i++) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < t.getNumCols(); j++) { if (j>0) sb.append(" "); sb.append((int)Math.round(t.get(i,j))); }
        System.out.println(sb);
    }
}}
