//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;

public class ScalarMultiply {
    public static void main(String[] args) {
        SimpleMatrix a = new SimpleMatrix(new double[][]{{1, 2}, {3, 4}});
        SimpleMatrix c = a.scale(3);
        for (int i = 0; i < c.getNumRows(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < c.getNumCols(); j++) {
                if (j > 0) sb.append(" ");
                sb.append((int) Math.round(c.get(i, j)));
            }
            System.out.println(sb);
        }
    }
}
