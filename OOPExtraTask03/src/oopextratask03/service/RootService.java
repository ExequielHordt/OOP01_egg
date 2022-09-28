/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask03.service;

import oopextratask03.entity.Root;

/**
 *
 * @author Exequiel Hordt
 * @version 21 Sep 2022
 */
public class RootService {

    /**
     * This method consist in calculate the discriminant of the root
     *
     * @param root
     * @return double
     */
    public double getDiscriminant(Root root) {
        double calculate;
        calculate = Math.pow(root.getB(), 2) - (4 * root.getA() * root.getC());
        return calculate;
    }

    /**
     * This method consists in recognise if this equation has two solutions
     *
     * @param root
     * @return boolean
     */
    public boolean hasRoots(Root root) {
        if (getDiscriminant(root) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method consists in recognise if this equation has one solution
     *
     * @param root
     * @return boolean
     */
    public boolean hasRoot(Root root) {
        if (getDiscriminant(root) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method consists in show the solution
     *
     * @param root
     * @param x1
     * @param x2
     */
    public void getRoots(Root root, double x1, double x2) {
        if (hasRoots(root) == true) {
            System.out.println("Las soluciones son x1 = " + x1 + " , " + "x2 = " + x2);
        }
    }

    /**
     * This method consists in show the solution
     *
     * @param root
     * @param x
     */
    public void getRoot(Root root, double x) {
        if (hasRoot(root) == true) {
            System.out.println("La solución es x = " + x);
        }
    }

    /**
     * This method resolve the equation
     *
     * @param root
     */
    public void calculate(Root root) {
        if (hasRoots(root) == true) {
            double x1, x2;
            x1 = ((-root.getB()) + (Math.sqrt(Math.pow(root.getB(), 2) - (4 * root.getA() * root.getC())))) / (2 * root.getA());
            x2 = (-root.getB() - Math.sqrt(Math.pow(root.getB(), 2) - 4 * root.getA() * root.getC())) / (2 * root.getA());
            getRoots(root, x1, x2);
        }
        if (hasRoot(root) == true) {
            double x;
            x = (-root.getB()) / (2 * root.getA());
            getRoot(root, x);
        }
        if (hasRoots(root) == false && hasRoot(root) == false) {
            System.out.println("No existe solución");
        }
    }
}
