/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask06;

import java.util.Scanner;
import ooptask06.entity.CoffeeMaker;
import ooptask06.service.CoffeeMakerService;

/**
 *
 * @author Exe
 */
public class OOPTask06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoffeeMakerService coffeeMakerService = new CoffeeMakerService();
        CoffeeMaker coffee = new CoffeeMaker();
        coffee.setMaxCapacity(15);
        Scanner read = new Scanner(System.in);
        char selectOption = ' ';
        int amountCoffee, sizeCup;
        while (selectOption != 's') {            
            System.out.print("¡Bienvenido/a al Programa Nespresso!\nPor favor, seleccione la opción que desee pulsando el número que acompaña a cada opción (Presione la tecla S para salir):\n1) Agregar café a la cafetera\n2) Llenar cafetera\n3) Servir café\n4) Vaciar cafetera\nOpción seleccionada: ");
            selectOption = read.next().charAt(0);
            selectOption = Character.toLowerCase(selectOption);
            switch (selectOption) {
                case '1':
                    System.out.println("");
                    System.out.print("Ingrese la cantidad de cáfe que desea ingresar a la cafetera: ");
                    amountCoffee = read.nextInt();
                    coffeeMakerService.addCoffee(amountCoffee, coffee);
                    System.out.println("");
                    break;
                case '2':
                    System.out.println("");
                    coffeeMakerService.fillCoffeeMaker(coffee);
                    System.out.println("¡Se ha llenado la cafetera con éxito!");
                    System.out.println("");
                    break;
                case '3':
                    System.out.println("");
                    System.out.print("Ingrese el tamaño de la taza: ");
                    sizeCup = read.nextInt();
                    System.out.println(coffeeMakerService.pourCup(sizeCup, coffee));
                    System.out.println("");
                    break;
                case '4':
                    System.out.println("");
                    coffeeMakerService.coffeeMakerEmpty(coffee);
                    System.out.println("¡Cafetera vacíada con éxito!");
                    System.out.println("");
                    break;
                    
                default: 
                    System.out.println("");
                    System.out.println("La opción seleccionada NO es correcta");
                    System.out.println("");
                    break;

            }

        }
    }
}
