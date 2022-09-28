/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask04;

import oopextratask04.entity.Nif;
import oopextratask04.service.NifService;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Sep 2022
 */
public class OOPExtraTask04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        NifService nifServ = new NifService();
        Nif nif = nifServ.createNif();
        System.out.println("");
        //Show
        nifServ.showNif();
    }

}
