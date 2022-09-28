/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask02.service;

import java.util.Scanner;
import oopextratask02.entity.Point;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Sep 2022
 */
public class PointService {

    //Global variables
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private Point point;

    /**
     * This method consist in create two points
     *
     * @return Point
     */
    public Point createPoint() {
        point = new Point();
        System.out.print("Ingrese un número entero para asignar al punto x1: ");
        point.setX1(read.nextInt());
        System.out.print("Ingrese un número entero para asignar al punto y1: ");
        point.setY1(read.nextInt());
        System.out.print("Ingrese un número entero para asignar al punto x2: ");
        point.setX2(read.nextInt());
        System.out.print("Ingrese un número entero para asignar al punto y2: ");
        point.setY2(read.nextInt());
        return point;
    }

    /**
     * This method consist in calculate the distance between two points
     *
     * @return double
     */
    public double calculateDistance() {
        double distance, result;
        result = (Math.pow(point.getX2() - point.getX1(), 2)) + (Math.pow(point.getY2() - point.getY1(), 2));
        //Simplify number
        while (result % 2 == 0) {
            result = result / 2;
        }
        distance = Math.sqrt(result);
        return distance;
    }
}
