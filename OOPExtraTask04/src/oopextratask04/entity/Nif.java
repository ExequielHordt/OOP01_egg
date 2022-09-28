/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask04.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Sep 2022
 */
public class Nif {

    private long id_num;
    private char letter;

    public long getId_num() {
        return id_num;
    }

    public char getLetter() {
        return letter;
    }

    public void setId_num(long id_num) {
        this.id_num = id_num;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

}
