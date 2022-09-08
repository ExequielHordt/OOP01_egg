package ooptask04.service;

import java.util.Scanner;
import ooptask04.entity.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Exe
 */
public class RectangleService {

    public Rectangle createRectangle() {
        Scanner read = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.print("Ingrese la base del rectángulo: ");
        r1.setBase(read.nextInt());
        System.out.print("Ingrese la altura del rectángulo: ");
        r1.setHeight(read.nextInt());
        return r1;
    }

    public int surface(Rectangle r1) {
        int s;
        s = r1.getBase() * r1.getHeight();
        return s;
    }

    public int perimeter(Rectangle r1) {
        int p;
        p = (r1.getBase() + r1.getHeight()) * 2;
        return p;
    }

    public void drawRectangle(Rectangle r1) {
        int i, j, base, height;
        base = r1.getBase() - 1;
        height = r1.getHeight() - 1;
        for (i = 0; i <= height; i++) {
            for (j = 0; j <= base; j++) {
                if (i == 0 || j == 0 || i == height || j == base) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}//*
/*
(0,0)
*****
*
*
*
*****

 */
