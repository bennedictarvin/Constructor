/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategialgoritmik2;

/**
 *
 * @author Arvin Situmorang
 */
public class BubbleSort {

    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                }
            }
        }
        return arr;
    }
}
