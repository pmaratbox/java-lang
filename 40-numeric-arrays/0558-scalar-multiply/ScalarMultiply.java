//JAVA 26
//DEPS org.ejml:ejml-all:0.43.1
import org.ejml.simple.SimpleMatrix;

void main() {
    var a = new SimpleMatrix(new double[][]{{1, 2}, {3, 4}});
    var c = a.scale(3);
    for (var i = 0; i < c.getNumRows(); i++) {
        var sb = new StringBuilder();
        for (var j = 0; j < c.getNumCols(); j++) {
            if (j > 0) sb.append(" ");
            sb.append((int) Math.round(c.get(i, j)));
        }
        IO.println(sb);
    }
}
