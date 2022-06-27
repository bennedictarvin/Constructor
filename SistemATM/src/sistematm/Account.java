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
public class Account {

    private String accNumber;
    private String name;
    private String address;
    private double balance;

    public Account() {

    }

    public Account(String accNumber, String name, String address, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public String cekSaldo() {
        return "Account{" + "accNumber=" + accNumber + ", name=" + name + ", address=" + address + ", balance=" + balance + '}';
    }

}
