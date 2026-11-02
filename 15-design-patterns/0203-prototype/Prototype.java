static class Cell {
    int value;
    Cell(int value) { this.value = value; }
    Cell copy() { return new Cell(this.value); }
}

void main() {
    var original = new Cell(1);
    var clone = original.copy();
    clone.value = 2;
    IO.println(original.value + " " + clone.value);
}
