/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startegialgoritmik;

import java.util.Scanner;

/**
 *
 * @author Arvin Situmorang
 */
public class SequentialSearch {
    
    // Sequential Search merupakan cara pencarian data dengan membandingkan
    // satu per satu data yang ingin dicari dengan setiap data yang ada.
    // Cara ini menggunakan O(n) time, dengan waktu pencarian yang lebih efisien
    // dibandingkan dengan Binary Search.

    static int search(int[] a, int k) {
        int i = 0;
        int n = a.length;
        while (i < n && a[i] != k) {
            i++;
        }
        if (i < n) {
            return i + 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan ukuran array:");
        int ukuran = scan.nextInt();
        int[] x = new int[ukuran];

        System.out.println("Masukkan data array:");
        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
        }

        System.out.println("Masukkan data yang ingin dicari dalam array:");
        int cari = scan.nextInt();
        int hasil = search(x, cari);

        if (hasil != -1) {
            System.out.println("Data " + cari + " ada pada posisi ke-" + hasil + ", " + "indeks ke-" + (hasil - 1) + ".");
        } else {
            System.out.println("Data tidak ditemukan di dalam array!");
        }
    }
}
