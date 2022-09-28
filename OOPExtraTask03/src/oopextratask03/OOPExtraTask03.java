/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask03;

import oopextratask03.entity.Root;
import oopextratask03.service.RootService;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Sep 2022
 */
public class OOPExtraTask03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Root root;
        RootService rootService = new RootService();
        root = new Root(1, -5, 6);

        System.out.println("Ecuaciones de segundo grado");
        System.out.println("***************************");
        rootService.calculate(root);
    }

}
