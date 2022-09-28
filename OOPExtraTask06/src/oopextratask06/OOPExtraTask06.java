/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask06;

import oopextratask06.entity.HangingGame;
import oopextratask06.service.HangingGame_Service;

/**
 *
 * @author Exequiel Hordt
 * @version 23 Sep 2022
 */
public class OOPExtraTask06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Global variables 
        HangingGame_Service hangingGame_S = new HangingGame_Service();
        HangingGame game;

        //Procedures
        game = hangingGame_S.createGame();
        hangingGame_S.playGame();
        System.out.println("");

    }

}
