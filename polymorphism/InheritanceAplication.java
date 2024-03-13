package object_oriented.polymorphism;

import object_oriented.polymorphism.model.BankAccount;
import object_oriented.polymorphism.model.CheckoutAccount;
import object_oriented.polymorphism.model.SavingsAccount;

public class InheritanceAplication{
    public static void main(String[] args) {
        /*
         * exemplo de polirmofismo 
         * 
         * O polimorfismo permite que tratemos objetos dessas classes de forma genérica 
         * através da interface ContaBancaria. Por exemplo, 
         * podemos ter uma lista de objetos do tipo ContaBancaria,
         * onde cada elemento pode ser uma instância de ContaCorrente ou ContaPoupanca.
         * Podemos chamar os métodos sacar e depositar em cada objeto da lista sem saber
         *  qual tipo específico de conta estamos manipulando
         */
        @SuppressWarnings("unused")
        BankAccount conta1 = new CheckoutAccount(200,"Daniel");
        @SuppressWarnings("unused")
        BankAccount conta2 = new SavingsAccount(5000, "Yasmim");
    }
}