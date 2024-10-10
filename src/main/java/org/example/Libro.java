package org.example;

public class Libro {

    private String titulo;
    private String autor;
    private int paginaCount;


    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    public String infoLibro() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginaCount;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 471);
        Libro libro2 = new Libro("1984", "George Orwell", 328);

        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());
    }
}