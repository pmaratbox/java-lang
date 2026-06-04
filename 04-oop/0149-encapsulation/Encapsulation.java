public class Encapsulation {
    static class Account {
        private int balance;

        Account(int balance) {
            this.balance = balance;
        }

        void deposit(int amount) {
            balance += amount;
        }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Account account = new Account(100);
        account.deposit(50);
        System.out.println(account.getBalance());
    }
}
