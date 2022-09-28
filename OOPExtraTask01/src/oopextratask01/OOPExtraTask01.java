/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask01;

import java.util.Scanner;
import oopextratask01.entity.Song;

/**
 *
 * @author exe10
 */
public class OOPExtraTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Song song;
        String name, autor;
        System.out.print("Ingrese el nombre de la canción: ");
        name = read.next();
        System.out.print("Ingrese el autor de la canción: ");
        autor = read.next();
        song = new Song(name, autor);
        System.out.println("");
        System.out.println(song.toString());
        System.out.println("");
    }

}
