//JAVA 26
//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;
void main() {
   var a = new SimpleMatrix(new double[][]{{1, 2, 3}});
   var b = new SimpleMatrix(new double[][]{{10, 20, 30}});
   var c = a.plus(b);
   var sb = new StringBuilder();
   for (var j = 0; j < c.getNumCols(); j++) {
       if (j > 0) sb.append(" ");
       sb.append((int) Math.round(c.get(0, j)));
   }
   IO.println(sb);
}
