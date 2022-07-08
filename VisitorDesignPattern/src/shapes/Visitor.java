/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.Rectangle;

/**
 *
 * @author Arvin Situmorang
 */

// interface visitor menyatakan beberapa method visit
// yang sesuai terhadap classnya
public class Visitor {

    public interface VisitorInterface {
        // Visitor berguna untuk menambahkan method/perintah baru
        // pada turunan class yang sudah ada tanpa mengganggu kode yang sudah dibuat

        // method visitDot untuk memanggil class Dot, untuk memberi tahu
        // visitor elemen yang bekerja dengan class tersebut
        // mengambil id dot dan koordinat pusatnya
        String visitDot(Dot dot);

        
        // mengambil id circlenya, radius dan koordinat pusatnya
        String visitCircle(Circle circle);

        
        // mengambil id persegi, koordinat kiri-atas, lebar dan tingginya
        String visitRectangle(Rectangle rectangle);

        
        // mengambil id bentuknya dan juga id anak turunannya
        String visitCompoundGraphic(CompoundShape cg);
    }
}
