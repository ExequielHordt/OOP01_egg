/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopextratask01.entity;

/**
 *
 * @author exe10
 */
public class Song {

    private String tittle;
    private String autor;

    public Song() {
    }

    public Song(String tittle, String autor) {
        this.tittle = tittle;
        this.autor = autor;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAutor() {
        return autor;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Song{" + "tittle=" + tittle + ", autor=" + autor + '}';
    }

}
