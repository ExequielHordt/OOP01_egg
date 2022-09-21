/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask12;

import ooptask12.entity.Person;
import ooptask12.service.PersonService;

/**
 *
 * @author Exequiel Hordt
 * @version 20 Sep 2022
 */
public class OOPTask12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        PersonService personServ = new PersonService();
        Person person = personServ.createPerson();
        System.out.println("");
        if (personServ.minor(10) == true) {
            System.out.println(person.getName() + " es menor que la edad de la persona recibida como parámetro.");
        } else {
            System.out.println(person.getName() + " es mayor que la edad de la persona recibida como parámetro.");
        }
        System.out.println("");
        personServ.showPerson();
        System.out.println("");
    }

}
