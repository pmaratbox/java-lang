void main() {
    int[] count = {0};
    Runnable wrapped = () -> count[0]++;
    for (var i = 0; i < 5; i++) {
        wrapped.run();
    }
    System.out.println("calls: " + count[0]);
}
