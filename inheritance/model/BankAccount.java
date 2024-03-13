package object_oriented.inheritance.model;
/*
abrstação é toda a estrutura que possui atributos ou comportamentos(funções) 
enssenciais para classes filhas com por exemplo a classe BankAccount
*/
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
}
