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
public class BinarySearch {

    // Binary Search merupakan cara pencarian data dengan mengurutkan
    // terlebih dahulu data-data yang ada lalu kemudian dilakukan proses
    // pencarian. Untuk pengurutan dilakukan dalam O(nlogn) time, sedangkan
    // untuk proses pencarian dilakukan dengan O(logn) time, dengan time complexity
    // O(nlogn) + O(logn) = O(nlogn). Ini kurang efisien dari segi proses dibandingkan
    // dengan Sequential Search karena pekerjaan yang membutuhkan dua tahap yakni
    // sorting & searching.
    static void search(int[] a, int x, int y, int k) {
        int z = (x + y) / 2;
        while (x <= y) {
            if (a[z] < k) {
                x = z + 1;
            } else if (a[z] == k) {
                System.out.println("Data ditemukan pada indeks ke-" + z + ".");
                break;
            } else {
                y = z - 1;
            }
            z = (x + y) / 2;
        }
        if (x > y) {
            System.out.println("Data tidak ditemukan!");
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
        
        int a = x.length - 1;
        search(x, 0, a, cari);

    }
}
