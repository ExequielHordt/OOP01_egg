/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask08.service;

import ooptask08.entity.Chain;

/**
 *
 * @author exe10
 */
public class ChainService {

    public int vowelCounter(Chain phrase) {
        int i, counter;
        counter = 0;
        char letterCollection;
        for (i = 0; i < phrase.getLengthPhrase(); i++) {
            letterCollection = phrase.getPhrase().charAt(i);
            if (letterCollection == 'a' || letterCollection == 'e' || letterCollection == 'i' || letterCollection == 'o' || letterCollection == 'u') {
                counter += 1;
            }
        }
        return counter;
    }

    public String invertedSentence(Chain phrase) {
        int i;
        char letterCollection;
        String invertedPhrase;
        invertedPhrase = "";
        for (i = phrase.getLengthPhrase() - 1; i >= 0; i--) {
            letterCollection = phrase.getPhrase().charAt(i);
            invertedPhrase += letterCollection;
        }
        return invertedPhrase;
    }

    public int timesRepeats(Chain phrase, char character) {
        int i, counter;
        counter = 0;
        String phraseLowerCase;
        phraseLowerCase = phrase.getPhrase().toLowerCase();
        character = Character.toLowerCase(character);
        for (i = 0; i < phrase.getLengthPhrase(); i++) {
            if (character == phraseLowerCase.charAt(i)) {
                counter += 1;
            }
        }
        return counter;
    }

    public boolean compareLength(Chain phrase, String phraseNew) {
        if (phrase.getLengthPhrase() == phraseNew.length()) {
            return true;
        } else {
            return false;
        }
    }

    public String linkingPhrases(Chain phrase, String phraseNew) {
        String phraseReturn;
        phraseReturn = phrase.getPhrase() + phraseNew;
        return phraseReturn;
    }

    public String replaceCharacter(Chain phrase, char character) {
        String phraseAux;
        char characterA;
        int i;
        characterA = 'a';
        phraseAux = "";
        for (i = 0; i < phrase.getLengthPhrase(); i++) {
            if (characterA == phrase.getPhrase().toLowerCase().charAt(i)) {
                phraseAux += character;
            } else {
                phraseAux += phrase.getPhrase().charAt(i);
            }
        }
        return phraseAux;
    }

    public boolean containerCharacter(Chain phrase, char character) {
        boolean verify;
        int i;
        verify = false;
        for (i = 0; i < phrase.getLengthPhrase(); i++) {
            if (character == phrase.getPhrase().charAt(i)) {
                verify = true;
            }
        }
        return verify;
    }

}
