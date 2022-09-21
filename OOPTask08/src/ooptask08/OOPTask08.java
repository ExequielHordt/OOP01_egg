/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask08;

import java.util.Scanner;
import ooptask08.entity.Chain;
import ooptask08.service.ChainService;

/**
 *
 * @author exe10
 */
public class OOPTask08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChainService phraseService = new ChainService();
        Chain phraseChain;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String phrase;
        char character, option;
        option = ' ';
        System.out.println("Cadena de texto");
        System.out.println("***************");
        System.out.print("Ingrese una palabra o frase: ");
        phrase = read.next();
        phraseChain = new Chain(phrase, phrase.length());
        do {
            System.out.print("Seleccione una opción ingresando los siguientes números (presione la tecla S para salir):"
                    + "\n1)Ingresar una nueva frase"
                    + "\n2)Contabilizar vocales"
                    + "\n3)Invertir frase"
                    + "\n4)Comprobar número de veces que se repite una letra en la frase"
                    + "\n5)Comprobar longitud de la frase original con la longitud de otra frase"
                    + "\n6)Unir frases"
                    + "\n7)Reemplazar los carácteres A"
                    + "\n8)Comprobar si la frase contiene un carácter específico"
                    + ""
                    + "\nOpción seleccionada: ");
            option = read.next().charAt(0);
            option = Character.toLowerCase(option);
            switch (option) {
                case '1':
                    System.out.print("Ingrese una palabra o frase: ");
                    phrase = read.next();
                    phraseChain = new Chain(phrase, phrase.length());
                    break;
                case '2':
                    System.out.println("El número de vocales es: " + phraseService.vowelCounter(phraseChain));
                    break;
                case '3':
                    System.out.println("La palabra / frase invertida es: " + phraseService.invertedSentence(phraseChain));
                    break;
                case '4':
                    System.out.print("Ingrese un carácter para saber cuantas veces se repite"
                            + " en la clase: ");
                    character = read.next().charAt(0);
                    System.out.println("El carácter " + character + " se repite " + phraseService.timesRepeats(phraseChain, character) + " vez / veces");
                    break;
                case '5':
                    System.out.print("Ingrese una palabra / frase: ");
                    phrase = read.next();
                    if (phraseService.compareLength(phraseChain, phrase)) {
                        System.out.println("Las palabras / frases ingresadas tienen la misma"
                                + " longitud.");
                    } else {
                        System.out.println("Las palabras / frases ingresadas NO tienen la misma longitud");
                    }
                    break;
                case '6':
                    System.out.print("Ingrese una nueva frase para unir a la frase "
                            + "original: ");
                    phrase = read.next();
                    System.out.println("La nueva frase es: " + phraseService.linkingPhrases(phraseChain, phrase));
                    break;
                case '7':
                    System.out.print("Ingrese un carácter para reemplazar por el carácter A en la palabra / frase original: ");
                    character = read.next().charAt(0);
                    System.out.println("La palabra / frase resultante es: " + phraseService.replaceCharacter(phraseChain, character));
                    break;
                case '8':
                    System.out.print("Ingrese una letra para saber si la "
                            + "frase contiende dicha letra: ");
                    character = read.next().charAt(0);
                    if (phraseService.containerCharacter(phraseChain, character) == true) {
                        System.out.println("Si, la frase contiene la letra " + character);
                    } else {
                        System.out.println("No, la frase no contiene la letra " + character);
                    }
                    break;
                case 's':
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("¡La opción ingresada no es correcta!"
                            + "\nPor favor, seleccione una opción válida");
                    break;

            }
            System.out.println("");
        } while (option != 's');

        System.out.println("");
    }

}
