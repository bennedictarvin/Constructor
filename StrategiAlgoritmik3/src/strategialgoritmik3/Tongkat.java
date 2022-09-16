/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategialgoritmik3;

import java.util.Scanner;

/**
 *
 * @author Arvin Situmorang
 */
public class Tongkat {
    
    int formula(int n) { // Kompleksiatas: O(1)
        if (n == 0) { // Kita harus memotong tongkat menjadi dua bagian dengan potongan terpanjang
                      // yang mungkin dengan potongan pertama. Potong lebih lanjut kedua bagian yang
                      // diperoleh menjadi dua bagian terpanjang masing-masing pada potongan berikutnya,
                      // lalu ulangi sampai memperoleh n bagian tongkat.
            return 0;
        }
        return (int)Math.ceil(Math.log(n) / Math.log(2));
    }
    
    Tongkat() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan ukuran tongkat (dalam cm):");
        int n = scan.nextInt();
        
        System.out.println("Jumlah minimum potongan yang bisa didapatkan dari tongkat berukuran " + n + " cm adalah " + formula(n) + " potongan.");
    }
    
    public static void main(String[] args) {
        new Tongkat();
    }
}
