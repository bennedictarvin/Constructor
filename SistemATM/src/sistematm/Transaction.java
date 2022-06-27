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
public class Transaction {

    private String transactionID;
    private Date dateTime;

    public Transaction() {
        java.util.Date date = new java.util.Date();
        Transaction trans = new Transaction("447391", date);

    }

    public Transaction(String transactionID, Date dateTime) {
        this.transactionID = transactionID;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Transaction{" + "transactionID=" + transactionID + ", dateTime=" + dateTime + '}';
    }

}
