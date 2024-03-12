package object_oriented.abrastration.model;

public class SavingsAccount extends BankAccount {

    SavingsAccount( int balance, String account) {
        //Ao accessar o super ele irá redirencionar para o classe pai
        super(balance, account);

    }
    
}
