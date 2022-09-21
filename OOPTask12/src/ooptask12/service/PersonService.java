/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask12.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import ooptask12.entity.Person;

/**
 *
 * @author Exequiel Hordt
 * @version 20 Sep 2022
 */
public class PersonService {
    
    private Date current_date = new Date();
    private Person p;
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
// This method consist in create a person with name and date of birth

    public Person createPerson() {
        p = new Person();
        String name;
        Date dateOfBirth;
        int day, month, year;
        System.out.print("Ingrese el nombre de la persona: ");
        name = read.next();
        System.out.println("Fecha de nacimiento");
        System.out.println("-------------------");
        do {
            //Day format dd
            System.out.print("Dia: ");
            day = read.nextInt();
            //Month format mm
            System.out.print("Mes: ");
            month = read.nextInt();
            //Year format yyyy
            System.out.print("Año: ");
            year = read.nextInt();
            dateOfBirth = new Date(year - 1900, month - 1, day);
            if (current_date.compareTo(dateOfBirth) == -1) {
                System.out.println("¡La fecha de nacimiento ingresada no es correcta!"
                        + "\nPor favor, ingrese una fecha válida");
            }
        } while (current_date.compareTo(dateOfBirth) == -1);
        p.setName(name);
        p.setDateOfBirth(dateOfBirth);
        return p;
    }
    
    public int calculateAge() {
        int age;
        age = current_date.getYear() - p.getDateOfBirth().getYear();
        return age;
    }
    
    public boolean minor(int age) {
        if (calculateAge() < age) {
            return true;
        } else {
            return false;
        }
    }
    
    public void showPerson() {
        System.out.println("Nombre: " + p.getName());
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE, dd 'de' MMMMMM 'de' yyyy");
        System.out.println("Fecha de nacimiento: " + dateFormat.format(p.getDateOfBirth()));
    }
}
