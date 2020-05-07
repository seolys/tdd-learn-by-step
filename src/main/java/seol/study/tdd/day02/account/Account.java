package seol.study.tdd.day02.account;

public class Account {
    private int balance;

    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        this.balance -= money;
    }

    public void deposit(int money) {
        this.balance += money;
    }


}
