/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opptask02.service;

import java.lang.Math;
import java.util.Scanner;
import opptask02.entity.Circunference;

/**
 *
 * @author Exe
 */
public class CircunferenceService {

    public Circunference createCircunference() {
        Scanner read = new Scanner(System.in);
        Circunference c1 = new Circunference();
        double radio;
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = read.nextDouble();
        c1.setRadio(radio);
        return c1;
    }

    public double area(double radio) {
        double a;
        a = Math.PI * Math.pow(radio, 2);
        return a;
    }

    public double perimeter(double radio) {
        double p;
        p = 2 * Math.PI * radio;
        return p;
    }
}
