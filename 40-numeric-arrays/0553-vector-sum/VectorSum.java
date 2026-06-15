//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;
public class VectorSum { public static void main(String[] x) {
    SimpleMatrix v = new SimpleMatrix(new double[][]{{1, 2, 3, 4}});
    double total = v.elementSum();
    System.out.println((int) Math.round(total));
}}
