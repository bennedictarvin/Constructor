/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawatinaprs;

import java.util.Scanner;

/**
 *
 * @author Arvin Situmorang
 */
public class Pasien {

    String nama;
    JenisKamar[] rawatInap = new JenisKamar[10];
    JenisPerawatan[] perawatan = new JenisPerawatan[5];
    boolean pakaiBPJS = true;
    Pasien[] patients = new Pasien[150];

    public double totalBiaya(double totalBayar) {
        if (pakaiBPJS) {
            totalBayar = perawatan.length;
        } else {
            totalBayar = perawatan.length + rawatInap.length;
        }
        return totalBayar;
    }

    public double pendapatanRS(double biaya) {
        double pendapatan;
        pendapatan = patients.length * totalBiaya(biaya);
        return pendapatan;
    }

    public int jenisPerawatanPasien(String jenis) {
        int count = 0;
        switch (jenis) {
            case "Operasi":
                count++;
            case "X-Ray":
                count++;
            case "USG":
                count++;
            default:
                count = 0;
        }
        return count;
    }

    public Pasien() {
        Scanner scan = new Scanner(System.in);

        nama = scan.next();
        System.out.println("Nama: " + nama);
        double bayar = scan.nextInt();
        System.out.println("Jenis perawatan?");
        String jenisPerawatan = scan.next();

        System.out.println("Total bayar: " + totalBiaya(bayar));
        System.out.println("Pendapatan RS: " + pendapatanRS(bayar));
        System.out.println("Jumlah pasien dengan jenis perawatan Operasi: " + jenisPerawatanPasien(jenisPerawatan));
        System.out.println("Jumlah pasien dengan jenis perawatan X-Ray: " + jenisPerawatanPasien(jenisPerawatan));
        System.out.println("Jumlah pasien dengan jenis perawatan USG: " + jenisPerawatanPasien(jenisPerawatan));

    }

    public static void main(String[] args) {
        new Pasien();
    }
}
