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
public class Dot implements Shape {
    
    //
    private int id;
    private int x;
    private int y;
    
    public Dot() {
        
    }
    
    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void move(int x, int y) {
        // pindahkan bentuk
    }
    
    @Override
    public void draw() {
        // gambar bentuk
    }
    
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
