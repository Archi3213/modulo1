package com.anahuac.mayab.modulo1.sesion3;

public class Perro {
    // Variables de instancia o atributos
    // private String raza;
    private String tamaño;
    private double peso;
    private String nombre;
    private String nombreDuenio;
    private int edad;

    public Perro() {
    }

    public Perro(String raza, String tamaño, double peso, String nombre, String nombreDuenio, int edad) {
        super();
        this.tamaño = tamaño;
        this.peso = peso;
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.edad = edad;
    }

    public Perro(String raza, String nombre, int edad, String nombreDuenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDuenio = nombreDuenio;
    }

    public Perro(String raza, String nombre, double peso, String nombreDuenio) {
        this.nombre = nombre;
        this.peso = peso;
        this.nombreDuenio = nombreDuenio;
    }

    public Perro(String raza, String nombre, String nombreDuenio) {
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
    }


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

}

