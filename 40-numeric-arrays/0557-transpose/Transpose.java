//JAVA 26
//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;
void main() {
   var a = new SimpleMatrix(new double[][]{{1,2,3},{4,5,6}});
   var t = a.transpose();
   for (var i = 0; i < t.getNumRows(); i++) {
       var sb = new StringBuilder();
       for (var j = 0; j < t.getNumCols(); j++) { if (j>0) sb.append(" "); sb.append((int)Math.round(t.get(i,j))); }
       System.out.println(sb);
   }
}
