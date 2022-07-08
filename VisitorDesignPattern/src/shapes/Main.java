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
public class Main {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape cs = new CompoundShape(4);
        cs.add(dot);
        cs.add(circle);
        cs.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        cs.add(c);

    }
}
