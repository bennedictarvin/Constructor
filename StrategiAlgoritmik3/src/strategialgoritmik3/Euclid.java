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
public class Euclid {
    int euclid(int m, int n) {
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
    
    Euclid() {
        System.out.println(euclid(4, 0));
    }
    
    public static void main(String[] args) {
        new Euclid();
    }
}
