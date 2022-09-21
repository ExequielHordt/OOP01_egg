/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opptask02;

import opptask02.entity.Circunference;
import opptask02.service.CircunferenceService;

/**
 *
 * @author Exe
 */
public class OPPTask02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calcular en área y perímetro de una circunferencia");
        System.out.println("**************************************************");
        CircunferenceService cs = new CircunferenceService();
        Circunference c = cs.createCircunference();
        System.out.println("");
        System.out.println("El área de la circunferencia es: " + cs.area(c.getRadio()));
        System.out.println("El perímetro de la circunferencia es: " + cs.perimeter(c.getRadio()));
        System.out.println("");
    }

}
