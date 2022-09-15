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
public class InsertionSort {
    
    public int[] search(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int v = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + i] = v;
        }
        return a;
    }
    
    public void print(int[] k) {
        System.out.println("Hasil sorting: ");
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
    }

    public InsertionSort() {
        int[] arr = {30, 17, 11, 4, 28, 15, 8, 9};
        System.out.println("Hasil sorting: " + search(arr));
        print(arr);
    }

    public static void main(String[] args) {
        new InsertionSort();
    }
}
