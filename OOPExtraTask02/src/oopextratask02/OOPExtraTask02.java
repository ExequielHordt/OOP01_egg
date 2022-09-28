/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask02;

import oopextratask02.entity.Point;
import oopextratask02.service.PointService;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Sep 2022
 */
public class OOPExtraTask02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        PointService pointService = new PointService();
        Point point;

        System.out.println("Distancia entre dos puntos en el plano cartesiano");
        System.out.println("*************************************************");

        point = pointService.createPoint();
        System.out.println("La distancia entre los puntos (" + point.getX1() + "," + point.getY1() + ")" + " y " + "(" + point.getX2() + "," + point.getY2()
                + ") es: " + pointService.calculateDistance());
        System.out.println("");

    }

}
