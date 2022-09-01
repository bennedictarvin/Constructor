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
public class Binary {

    static int search(int n) {
        int count = 1;
        while (n > 1) {
            count++;
            n /= 2;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat positif:");
        int bilangan = scan.nextInt();
        System.out.println("Jumlah angka biner dalam perwakilan biner n: " + search(bilangan));
    }
}
