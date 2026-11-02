void main() {
    for (var i = 1; i <= 15; i++) {
        if (i % 15 == 0) {
            IO.println("FizzBuzz");
        } else if (i % 3 == 0) {
            IO.println("Fizz");
        } else if (i % 5 == 0) {
            IO.println("Buzz");
        } else {
            IO.println(i);
        }
    }
}
