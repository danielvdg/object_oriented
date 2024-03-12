package object_oriented.encapsulation;

import object_oriented.encapsulation.model.BankAccount;

public class EncapsulationApplication {
    public static void main(String[] args) {
        BankAccount conta1 = new BankAccount(5,"Daniel");
       
        //uso do encapsulamento
        conta1.getBalance();
        conta1.setBalance(10);
        conta1.getAccount();
        conta1.setAccount("Daniel Alves");
    }
}
