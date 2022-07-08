/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Arvin Situmorang
 */

// interface elemen menyatakan sebuah method accept
// yang mengambil interface visitor dasar sebagai argumen

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
