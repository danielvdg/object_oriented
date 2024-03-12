package object_oriented.encapsulation.model;


public class BankAccount {
    private int balance;
    private String account ;

    public BankAccount(int balance, String account ) {
        this.balance = balance;
        this.account  = account ;
    }

    //encapsulamento
    public int getBalance() {
        return balance;
    }

    public int setBalance(int balance) {
        return this.balance = balance;
    }

    public String getAccount() {
        return this.account;
    }

    public String setAccount(String account ) {
        return this.account  = account;
    }
}
