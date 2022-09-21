/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask08.entity;

/**
 *
 * @author exe10
 */
public class Chain {
private String phrase;
private int lengthPhrase;

    public Chain() {
    }

    public Chain(String phrase, int lengthPhrase) {
        this.phrase = phrase;
        this.lengthPhrase = lengthPhrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public int getLengthPhrase() {
        return lengthPhrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public void setLengthPhrase(int lengthPhrase) {
        this.lengthPhrase = lengthPhrase;
    }

    
    
    
}
