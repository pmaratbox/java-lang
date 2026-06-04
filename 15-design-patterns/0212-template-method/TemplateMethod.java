public class TemplateMethod {
    static abstract class Algorithm {
        abstract String step();
        String run() {
            return "start " + step() + " end";
        }
    }

    static class WorkAlgorithm extends Algorithm {
        String step() { return "work"; }
    }

    public static void main(String[] args) {
        Algorithm a = new WorkAlgorithm();
        System.out.println(a.run());
    }
}
