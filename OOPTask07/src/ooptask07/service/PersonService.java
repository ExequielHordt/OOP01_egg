/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask07.service;

/**
 * el método crear persona, le pide los valores de los atributos al usuario y
 * después se le asignan a sus respectivos atributos para llenar el objeto
 * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H,
 * M o O. Si no es correcto se deberá mostrar un mensaje
 *
 * @author Exe
 */
import java.lang.Math;
import java.util.Scanner;
import ooptask07.entity.Person;

public class PersonService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void createPerson(Person person) {
        char sex;
        System.out.print("Ingrese su nombre: ");
        person.setName(read.next());
        System.out.print("Ingrese su edad: ");
        person.setAge(read.nextInt());
        do {
            System.out.print("Ingrese su sexo: ");
            sex = read.next().charAt(0);
            sex = Character.toLowerCase(sex);
            if (sex == 'h' || sex == 'm' || sex == 'o') {
                person.setSex(sex);
            } else {
                System.out.print("¡El dato ingresado NO es correcto! Por favor, ingrese nuevamente");
            }
        } while (sex != 'h' && sex != 'm' && sex != 'o');

        System.out.print("Ingrese su peso: ");
        person.setWeight(read.nextDouble());
        System.out.print("Ingrese su altura: ");
        person.setHeight(read.nextDouble());

    }

    public int calculateIMC(Person person) {
        double idealWeight;
        idealWeight = (person.getWeight()) / Math.pow(person.getHeight(), 2);
        if (idealWeight > 25) {
            return 1;
        } else if (idealWeight >= 20 || idealWeight <= 25) {
            return 0;
        } else {
            return -1;
        }

    }

    public boolean legalAge(Person person) {
        if (person.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
