/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematm;

/**
 *
 * @author Arvin Situmorang
 */
public class Main {

    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine("799821", 350000.0, ActiveEnum.ACTIVE);
        System.out.println(atm.insertCard());

        ATMCard card = new ATMCard("8490284183", "905821", "398502", "Anton", "Jl. Braga", 500301.54);
        System.out.println(card.validatePIN());

        Account akun = new Account("398502", "Anton", "Jl. Braga", 500301.54);
        System.out.println(akun.cekSaldo());

        java.util.Date date = new java.util.Date();
        WithdrawalTransaction w = new WithdrawalTransaction(200000, "447391", date);
        System.out.println(w.withdrawal());

        TransferTransaction t = new TransferTransaction("684024", 150000, "447391", date);
        System.out.println(t.transfer());
        
        System.out.println(atm.ejectCard());
    }
}
