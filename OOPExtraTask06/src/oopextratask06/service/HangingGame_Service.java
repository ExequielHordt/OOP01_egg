/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask06.service;

import java.util.Scanner;
import oopextratask06.entity.HangingGame;

/**
 *
 * @author Exequiel Hordt
 * @version 23 Sep 2022
 */
public class HangingGame_Service {

    //Global variables
    private Scanner read;
    private HangingGame game;
    private int notFound;

    public HangingGame_Service() {
        this.read = new Scanner(System.in).useDelimiter("\n");
    }

    /**
     * This method consist in create a Hanging Game
     *
     * @return HangingGame
     */
    public HangingGame createGame() {
        //Variables
        game = new HangingGame();
        String word;
        char collectLetter;
        String[] guessWord;
        int attemptsMax, i;
        //Procedures
        System.out.println("Bienvenido/a al juego del ahorcado");
        System.out.println("**********************************");
        System.out.print("Ingrese una palabra: ");
        word = read.next();
        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        attemptsMax = read.nextInt();
        guessWord = new String[word.length()];
        for (i = 0; i < guessWord.length; i++) {
            collectLetter = word.charAt(i);
            guessWord[i] = String.valueOf(collectLetter);
        }
        game.setSearchWord(guessWord);
        game.setAttempsMax(attemptsMax);
        game.setLetterFound(0);
        notFound = wordLength();
        return game;
    }

    /**
     * This method return the word's length
     *
     * @return int
     */
    public int wordLength() {
        return game.getSearchWord().length;
    }

    /**
     * This method consist in return true or false depends of the compare
     *
     * @param letter
     */
    public void searchLetter(char letter) {
        //Variables
        int i;
        boolean found;
        String character;
        found = false;
        //Procedures
        for (i = 0; i < game.getSearchWord().length; i++) {
            if (Character.toLowerCase(letter) == Character.toLowerCase(game.getSearchWord()[i].charAt(0))) {
                found = true;
            }
        }
        System.out.println("Longitud de la palabra: " + wordLength());
        if (found == true) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    /**
     * This method consist in show the letters are found and wich are missing
     *
     * @param letter
     * @return foundLetter This variable has the answer about if found or not
     * the letter
     */
    public boolean found(char letter) {
        //Variables
        int i;
        boolean foundLetter;
        foundLetter = false;
        //Procedures
        for (i = 0; i < game.getSearchWord().length; i++) {
            if (Character.toLowerCase(letter) == Character.toLowerCase(game.getSearchWord()[i].charAt(0))) {
                foundLetter = true;
                game.setLetterFound(game.getLetterFound() + 1);
            }
        }
        System.out.println("Número de letras (encontradas, faltantes): " + "(" + game.getLetterFound() + ","
                + (notFound - game.getLetterFound()) + ")");
        return foundLetter;
    }

    /**
     * This method consists of subtracting the opportunities and showing how
     * many are left
     *
     * @param foundLetter
     */
    public void attemps(boolean foundLetter) {
        if (foundLetter == false) {
            game.setAttempsMax(game.getAttempsMax() - 1);
        }
        System.out.println("Número de oportunidades restantes: " + game.getAttempsMax());
    }

    /**
     * This method consist in to start the game
     */
    public void playGame() {
        //Variables
        char letter;
        //Procedures
        do {
            System.out.print("Ingrese una letra: ");
            letter = read.next().charAt(0);
            System.out.println("");
            searchLetter(letter);
            attemps(found(letter));
        } while (game.getAttempsMax() != 0 && game.getLetterFound() != wordLength());
        if (game.getAttempsMax() == 0) {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        } else {
            System.out.println("Mensaje: ¡Felicidades, has ganado el juego!");
        }
    }
}

// 4 
// 2
// 1
