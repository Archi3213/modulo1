package com.anahuac.mayab.modulo1.sesion3;

public class Perro {
    private String nombre;
    private String nombreDuenio;
    private int edad;

    // Constructor
    public Perro(String nombre, String nombreDuenio, int edad) {
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.edad = edad;
    }

    // Método ladrar
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau! Mi dueño es " + nombreDuenio);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
