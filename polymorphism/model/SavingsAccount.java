package object_oriented.polymorphism.model;

public class SavingsAccount extends BankAccount {

    public SavingsAccount( int balance, String account) {
        //Ao accessar o super ele irá redirencionar para o classe pai
        super(balance, account);

    }
    
}
