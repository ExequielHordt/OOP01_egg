/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask01;

import ooptask01.entity.Libro;
import ooptask01.service.ServicioLibro;

/**
 * Answer Crear una clase llamada Libro que contenga los siguientes atributos:
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
 * atributos pasados por parámetro y un constructor vacío. Crear un método para
 * cargar un libro pidiendo los datos al usuario y luego informar mediante otro
 * método el número de ISBN, el título, el autor del libro y el numero de
 * páginas.
 *
 * @author Exe
 */
public class OOPTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioLibro bookService = new ServicioLibro();
        Libro book = bookService.cargarLibro();        
        bookService.mostrarLibro(book);
        
    }
    
}
