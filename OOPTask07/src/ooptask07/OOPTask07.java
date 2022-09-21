/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask07;

import ooptask07.entity.Person;
import ooptask07.service.PersonService;

/**
 *
 * @author Exe
 */
public class OOPTask07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Crear Persona");
        System.out.println("*************");
        PersonService personService = new PersonService();
        Person[] listPerson = new Person[4];
         int i;
        double overweightCounter, idealWeightCounter, weightUnderCounter, legalAgeCounter, underageCounter;
        idealWeightCounter = legalAgeCounter = overweightCounter = underageCounter = weightUnderCounter = 0.0;
        for (i = 0; i < listPerson.length; i++) {
            listPerson[i] = new Person();
            personService.createPerson(listPerson[i]);
            System.out.println("");
            switch (personService.calculateIMC(listPerson[i])) {
                case 1:
                    System.out.print(listPerson[i].getName() + " tiene sobrepeso");
                    overweightCounter += 1;
                    break;
                case 0:
                    System.out.print(listPerson[i].getName() + " tiene un peso ideal");
                    idealWeightCounter += 1;
                    break;
                case -1:
                    System.out.print(listPerson[i].getName() + " tiene un peso por debajo de lo ideal");
                    weightUnderCounter += 1;
                    break;
            }
            if (personService.legalAge(listPerson[i]) == true) {
                System.out.print(" y " + "es mayor de edad");
                legalAgeCounter += 1;
            } else {
                System.out.print(" y " + "es menor de edad");
                underageCounter += 1;
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("Porcentaje de personas que están por debajo de su peso: " + weightUnderCounter / 100 + "%");
        System.out.println("Porcentaje de personas que están en su peso ideal: " + idealWeightCounter / 100 + "%");
        System.out.println("Porcentaje de personas que están con sobrepeso: " + overweightCounter / 100 + "%");
        System.out.println("Porcentaje de personas que son mayores de edad: " + legalAgeCounter / 100 + "%");
        System.out.println("Porcentaje de personas que son menores de edad: " + underageCounter / 100 + "%");
    }

}
