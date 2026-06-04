public class Prototype {
    static class Cell {
        int value;
        Cell(int value) { this.value = value; }
        Cell copy() { return new Cell(this.value); }
    }

    public static void main(String[] args) {
        Cell original = new Cell(1);
        Cell clone = original.copy();
        clone.value = 2;
        System.out.println(original.value + " " + clone.value);
    }
}
