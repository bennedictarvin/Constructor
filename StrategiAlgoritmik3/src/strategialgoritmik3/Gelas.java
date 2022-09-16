/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategialgoritmik3;

/**
 *
 * @author Arvin Situmorang
 */
public class Gelas {
    
    void urutkan(int[] a, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }
    
    public Gelas() {
        // Kompleksitas: O(log n)
        // Berlaku untuk nomor 1 dan 2, baik secara acak maupun tidak tetap menghasilkan output yang sama
        int[] a = {1, 0}; // 2n gelas, sehingga hanya jenis gelasnya saja, bukan banyaknya gelas yang diinput
        int n = a.length;
        urutkan(a, n);
        
        for (int i = 0; i < 4; i++) {
            System.out.print(a[0] + " " + a[1] + " ");
        }
    }
    
    public static void main(String[] args) {
        new Gelas();
    }
}
