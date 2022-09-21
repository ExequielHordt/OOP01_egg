/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask09;

import java.util.Random;
import java.util.Scanner;
import ooptask09.entity.Mathematic;
import ooptask09.service.MathematicService;

/**
 *
 * @author exe10
 */
public class OOPTask09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        MathematicService ms_1 = new MathematicService();
        Mathematic m_1 = new Mathematic();
        int max = 20;
        int min = -20;
        Random r = new Random();
        System.out.println("Números matemáticos");
        System.out.println("*******************");
        //Random real numbers.
        m_1.setNum_1(r.nextInt((max - min) + 1) + min);
        m_1.setNum_2(r.nextInt((max - min) + 1) + min);
        System.out.println("El primer número real aleatorio es: " + m_1.getNum_1());
        System.out.println("El segundo número real aleatorio es: " + m_1.getNum_2());
        System.out.println("");
        //The Mathematic Service realice the different tasks.
        System.out.println("El mayor de los números aleatorios es: " + ms_1.majorNumber(m_1));
        System.out.println("La potencia del mayor de los números "
                + "(" + ms_1.majorNumber(m_1) + ")" + " es: " + ms_1.calculatePower(m_1));
        System.out.println("La raíz cuadrada del menor de los números "
                + "ingresados es: " + ms_1.squareRoot(m_1));
    }

}
