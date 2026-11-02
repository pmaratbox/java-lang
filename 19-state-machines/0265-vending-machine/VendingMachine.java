void main() {
    int[] coins = {10, 10, 5};
    var price = 25;
    var total = 0;
    var dispensed = false;
    for (var c : coins) {
        total += c;
        if (total >= price) {
            IO.println("dispensed");
            dispensed = true;
            break;
        }
    }
    if (!dispensed) {
        IO.println("waiting");
    }
}
