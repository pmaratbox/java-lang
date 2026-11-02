//JAVA 26
//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;

void main() {
    var a = new SimpleMatrix(new double[][]{{1, 2, 3}});
    var b = new SimpleMatrix(new double[][]{{4, 5, 6}});
    var d = a.dot(b);
    IO.println((int) Math.round(d));
}
