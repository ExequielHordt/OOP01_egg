/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask01.service;

import java.util.Scanner;
import ooptask01.entity.Libro;

/**
 *
 * @author Exe
 */
public class ServicioLibro {

    public Libro cargarLibro() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        //I instance an object of type Libro
        Libro book = new Libro();
        //I load their values
        System.out.print("Ingrese el número ISBN del libro: ");
        book.setIsbn(read.nextInt());
        System.out.print("Ingrese el título del libro: ");
        book.setTitulo(read.next());
        System.out.print("Ingrese el autor del libro: ");
        book.setAutor(read.next());
        System.out.print("Ingrese el número de páginas del libro: ");
        book.setNumPage(read.nextInt());
        return book;
    }

    public void mostrarLibro(Libro book) {
        System.out.println(book.toString());
    }

}
