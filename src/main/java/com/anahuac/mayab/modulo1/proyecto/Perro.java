package com.anahuac.mayab.modulo1.proyecto;

public class Perro {
    // Variables de instancia o atributos
    private String raza;
    private String tamanio;
    private double peso;
    private String nombre;
    private String nombreDuenio;
    private int edad;

    // Constructores
    public Perro() {}

    public Perro(String raza, String tamanio, double peso, String nombre, String nombreDuenio, int edad) {
        this.raza = raza;
        this.tamanio = tamanio;
        this.peso = peso;
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.edad = edad;
    }

    public Perro(String raza, String nombre, int edad, String nombreDuenio) {
        this.raza = raza;
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.edad = edad;
    }

    public Perro(String raza, String nombre, double peso, String nombreDuenio) {
        this.raza = raza;
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
        this.peso = peso;
    }

    public Perro(String raza, String nombre, String nombreDuenio) {
        this.raza = raza;
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
    }

    // Getters y setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

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

    // Métodos / ¿Qué hace?
    public void ladrar() {
        System.out.println("¡Hola! Soy " + this.nombre + ", mi dueño es " + this.nombreDuenio + " y estoy ladrando: ¡guau guau!");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n[Raza: " + raza + ", Tamaño: " + tamanio + ", Peso: " + peso 
               + ", Dueño: " + nombreDuenio + ", Edad: " + edad + "]";
    }
}
