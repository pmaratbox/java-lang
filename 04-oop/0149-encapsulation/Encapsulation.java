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

void main() {
    var account = new Account(100);
    account.deposit(50);
    System.out.println(account.getBalance());
}
