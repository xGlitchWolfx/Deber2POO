package org.example;

public class Persona {

    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Hodroks", 25, "Masculino");
        Persona persona2 = new Persona("Marthiz", 30, "Femenino");

        persona1.presentarse();
        persona2.presentarse();
    }
}