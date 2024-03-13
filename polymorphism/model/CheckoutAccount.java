package object_oriented.polymorphism.model;

public class CheckoutAccount extends BankAccount {

    public CheckoutAccount(int balance, String account) {
        //Ao accessar o super ele irá redirencionar para o classe pai
        super(balance, account);
    }
    
    
}