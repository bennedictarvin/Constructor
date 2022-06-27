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
public class TransferTransaction extends Transaction {

    private String destinationNumber;
    private double amount;

    public TransferTransaction() {

    }

    public TransferTransaction(String destinationNumber, double amount, String transactionID, Date dateTime) {
        super(transactionID, dateTime);
        this.destinationNumber = destinationNumber;
        this.amount = amount;
    }

    public String transfer() {
        return "TransferTransaction{" + "destinationNumber=" + destinationNumber + ", amount=" + amount + '}';
    }

}
