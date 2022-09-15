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
public class BinarySearch {

    int binarySearch(int[] a, int k) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < k) {
                low = mid++;
            } else if (a[mid] > k) {
                high = mid--;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
    public void print(int[] k) {
        System.out.println("Hasil sorting: ");
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i] + " ");
        }
    }

    public BinarySearch() {
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = arr.length;
        System.out.println(binarySearch(arr, 8));
        print(arr);
    }

    public static void main(String[] args) {
        new BinarySearch();
    }
}
