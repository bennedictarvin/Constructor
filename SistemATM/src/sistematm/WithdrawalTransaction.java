/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematm;

import java.util.Date;

/**
 *
 * @author Arvin Situmorang
 */
public class WithdrawalTransaction extends Transaction {

    private double amount;

    public WithdrawalTransaction() {
        
        
    }

    public WithdrawalTransaction(double amount, String transactionID, Date dateTime) {
        super(transactionID, dateTime);
        this.amount = amount;
    }

    public String withdrawal() {
        return "WithdrawalTransaction{" + "amount=" + amount + '}';
    }

    
}
