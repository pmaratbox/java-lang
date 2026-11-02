//JAVA 26
//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;
void main() {
   var v = new SimpleMatrix(new double[][]{{1, 2, 3, 4}});
   var total = v.elementSum();
   IO.println((int) Math.round(total));
}
