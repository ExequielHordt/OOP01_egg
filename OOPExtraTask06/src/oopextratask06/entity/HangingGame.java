/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask06.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 23 Sep 2022
 */
public class HangingGame {

    private String[] searchWord;
    private int letterFound;
    private int attempsMax;

    public HangingGame() {
    }

    public HangingGame(String[] searchWord, int letterFound, int attempsMax) {
        this.searchWord = searchWord;
        this.letterFound = letterFound;
        this.attempsMax = attempsMax;
    }

    public String[] getSearchWord() {
        return searchWord;
    }

    public int getLetterFound() {
        return letterFound;
    }

    public int getAttempsMax() {
        return attempsMax;
    }

    public void setSearchWord(String[] searchWord) {
        this.searchWord = searchWord;
    }

    public void setLetterFound(int letterFound) {
        this.letterFound = letterFound;
    }

    public void setAttempsMax(int attempsMax) {
        this.attempsMax = attempsMax;
    }

}
