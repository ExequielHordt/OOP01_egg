/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask3.service;

import java.util.Scanner;
import ooptask3.entity.Operation;

/**
 *
 * @author Exe
 */
public class OPerationService {

    public Operation createOperation() {
        Scanner read = new Scanner(System.in);
        Operation o1 = new Operation();
        System.out.print("Ingrese un valor para el primer número: ");
        o1.setNum1(read.nextInt());
        System.out.print("Ingrese un valor para el segundo número: ");
        o1.setNum2(read.nextInt());
        return o1;

    }

    public void plus(Operation o1) {
        int p;
        p = o1.getNum1() + o1.getNum2();
        System.out.println("La suma de los valores ingresados es: " + p);
        System.out.println("");
    }

    public void minus(Operation o1) {
        int m;
        m = o1.getNum1() - o1.getNum2();
        System.out.println("La resta de los valores ingresados es: " + m);
        System.out.println("");
    }

    public void multiplication(Operation o1) {
        int m;
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            m = 0;
            System.out.println("¡Error! La operación NO se puede realizar con 0 (CERO)");
        } else {
            m = o1.getNum1() * o1.getNum2();
            System.out.println("La multiplicación de los valores ingresados es: " + m);
        }
        System.out.println("");
    }

    public void division(Operation o1) {
        double d;
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {
            d = 0;
            System.out.println("¡Error! La operación NO se puede realizar con 0 (CERO)");
        } else {
            d = o1.getNum1() / o1.getNum2();
            System.out.println("La división de los valores ingresados es: " + d);
        }
        System.out.println("");
    }
}
