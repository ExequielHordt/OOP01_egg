/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask06.service;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import ooptask06.entity.CoffeeMaker;

/**
 *
 * @author Exe
 */
public class CoffeeMakerService {

    private Scanner read = new Scanner(System.in);

    public void fillCoffeeMaker(CoffeeMaker coffee) {
        coffee.setCurrentCapacity(coffee.getMaxCapacity());
    }

    public String pourCup(int sizeCup, CoffeeMaker coffee) {
        int serveCoffee;
        if (coffee.getCurrentCapacity() == 0) {
            return "¡No hay más café! No se logró llenar la taza :(";
        } else if (coffee.getCurrentCapacity() >= sizeCup) {
            coffee.setCurrentCapacity(coffee.getCurrentCapacity() - sizeCup);
            return "¡Taza llena! Disfrute de su café :D";
        } else {
            serveCoffee = sizeCup - coffee.getCurrentCapacity();
            coffee.setCurrentCapacity(0);
            return "¡Café servido! Pero no se logró llenar la taza. La taza quedó en " + serveCoffee;
        }
    }

    public void coffeeMakerEmpty(CoffeeMaker coffee) {
        coffee.setCurrentCapacity(0);
    }

    public void addCoffee(int amountCoffee, CoffeeMaker coffee) {
        if (amountCoffee > coffee.getMaxCapacity() || amountCoffee + coffee.getCurrentCapacity() > coffee.getMaxCapacity()) {
            System.out.println("La cantidad ingresada de café SUPERA la capacidad máxima de la cafetera! Por favor, ingrese menos cantidad");
        } else {
            coffee.setCurrentCapacity(amountCoffee);
            System.out.println("¡Café agregado con éxito en la cafetera!");
        }
    }

}

class Helper extends TimerTask {

    Timer time;
    public static int i = 0;

    @Override
    public void run() {
        System.out.println("Sirviendo café... " + ++i);
        if (i >= 3) {
            time.cancel();
            time.purge();
            System.exit(0);
            return;
        }
    }
}

/*
Si capAct == 0 entonces{
La cafetera se quedo sin café!
}
mc= 15
t = 5
Si capAct >= t{
15 - 5 
10}
mc= 10
t = 15
Sino{
cupIncomplete = t - capAct;
info copa

 */
