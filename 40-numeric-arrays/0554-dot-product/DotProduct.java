//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;

public class DotProduct {
    public static void main(String[] args) {
        SimpleMatrix a = new SimpleMatrix(new double[][]{{1, 2, 3}});
        SimpleMatrix b = new SimpleMatrix(new double[][]{{4, 5, 6}});
        double d = a.dot(b);
        System.out.println((int) Math.round(d));
    }
}
