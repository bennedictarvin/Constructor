/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arvin Situmorang
 */
public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();
    
    public CompoundShape(int id) {
        this.id = id;
    }
    
    @Override
    public void move(int x, int y) {
        // gerakkan bentuk
    }
    
    @Override
    public void draw() {
        // gambar bentu
    }

    public int getId() {
        return id;
    }
    
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }
    
    public void add(Shape shape) {
        children.add(shape);
    }
}
