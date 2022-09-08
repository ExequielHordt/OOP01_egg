/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptask01.entity;

/**
 *
 * @author Exe
 */
public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numPage;

    public Libro() {

    }

    public Libro(int isbn, String titulo, String autor, int numPage) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPage = numPage;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPage=" + numPage + '}';
    }

}
