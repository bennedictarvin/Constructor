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
public class ATMCard extends Account {

    private String cardNumber;
    private String PIN;

    public ATMCard() {
        
        
    }

    public ATMCard(String cardNumber, String PIN, String accNumber, String name, String address, double balance) {
        super(accNumber, name, address, balance);
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }

    public String validatePIN() {
        return "ATMCard{" + "cardNumber=" + cardNumber + ", PIN=" + PIN + '}';
    }

    
}
