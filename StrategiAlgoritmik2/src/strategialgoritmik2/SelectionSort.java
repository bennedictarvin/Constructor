/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategialgoritmik2;

import java.util.Collections;

/**
 *
 * @author Arvin Situmorang
 */
public class SelectionSort {

    public int[] sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 2; i++) {
            int min = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public void print(int[] k) {
        System.out.println("Hasil sorting: ");
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
    }

    public SelectionSort() {
        int[] arr = {89, 45, 68, 90, 29, 34, 17};
        sort(arr);
        print(arr);
    }

    public static void main(String[] args) {
        new SelectionSort();
    }
}
