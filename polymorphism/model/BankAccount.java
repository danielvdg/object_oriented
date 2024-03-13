package object_oriented.polymorphism.model;

public class BankAccount {
    private int balance;
    private String account;

    BankAccount(int balance, String account) {
        this.balance = balance;
        this.account = account;

    }

    public int getBalance() {
        return this.balance;
    }

    public int setBalance(int balance) {
        return this.balance = balance;
    }

    public String getAccount() {
        return this.account;
    }

    public String setAccount(String account) {
        return this.account = account;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de " + amount + " realizado com sucesso.");
    }

    public void sacar(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Saque de " + amount + " realizado com sucesso.");
        } else {
            System.out.println("balance insuficiente para saque.");
        }
    }
    
}
