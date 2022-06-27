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
public class ATMMachine {

    private String kodeATM;
    private double cash;
    private ActiveEnum status;

    public ATMMachine(String kodeATM, double cash, ActiveEnum status) {
        this.kodeATM = kodeATM;
        this.cash = cash;
        this.status = status;
    }

    public ATMMachine() {

    }

    public String insertCard() {
        return "ATMMachine{" + "kodeATM=" + kodeATM + ", cash=" + cash + ", status=" + status + '}';
    }

    public static void main(String[] args) {

    }

    public String ejectCard() {
        return "Transaksi selesai, kartu dikeluarkan!";
    }
}
