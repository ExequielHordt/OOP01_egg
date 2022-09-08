/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask3;

import ooptask3.entity.Operation;
import ooptask3.service.OPerationService;

/**
 *
 * @author Exe
 */
public class OOPTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        System.out.println("Realizar operaciones");
        System.out.println("********************");       
        OPerationService os = new OPerationService();
        Operation o1 = os.createOperation();
        System.out.println("");
        os.plus(o1);
        os.minus(o1);
        os.multiplication(o1);
        os.division(o1);
        
    }

}
