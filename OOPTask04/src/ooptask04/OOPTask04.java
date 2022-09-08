/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask04;

import ooptask04.entity.Rectangle;
import ooptask04.service.RectangleService;

/**
 *
 * @author Exe
 */
public class OOPTask04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rectángulo en Java");
        System.out.println("******************");
        RectangleService rs = new RectangleService();
        Rectangle r = rs.createRectangle();
        System.out.println("");
        System.out.println("La superficie del rectángulo es: " + rs.surface(r) + " y su perímetro: " + rs.perimeter(r));
        System.out.println("");
        rs.drawRectangle(r);
        System.out.println("");
    }

}
