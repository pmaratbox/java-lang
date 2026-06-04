public class VendingMachine {
    public static void main(String[] args) {
        int[] coins = {10, 10, 5};
        int price = 25;
        int total = 0;
        boolean dispensed = false;
        for (int c : coins) {
            total += c;
            if (total >= price) {
                System.out.println("dispensed");
                dispensed = true;
                break;
            }
        }
        if (!dispensed) {
            System.out.println("waiting");
        }
    }
}
