package com.anahuac.mayab.modulo1.proyecto;

import java.io.IOException;  // Importa la clase IOException

public class TestCartilla {

    public static void main(String[] args) {
        // Creación de los perros con la nueva información
        Perro perro1 = new Perro("Labrador", "Grande", 30.0, "Max", "Carlos P.", 4); // Perro 1
        Perro perro2 = new Perro("Bulldog", "Mediano", 12.5, "Rocky", "Ana L.", 6); // Perro 2
        
        // Creación de las cartillas de los perros
        CartillaPerro cartilla1 = new CartillaPerro(perro1, "PP00001"); // Cartilla del Perro 1
        CartillaPerro cartilla2 = new CartillaPerro(perro2, "PP00002"); // Cartilla del Perro 2
        
        // Actualización de las cartillas con las vacunas y fechas
        cartilla1.actualizar("Rabia", "12/JUN/2022");
        cartilla1.actualizar("Rabia", "12/JUN/2023");
        cartilla1.actualizar("Vacuna puppy", "12/JUN/2024");
        cartilla1.actualizar("Parvovirus", "01/JUL/2022");
        cartilla1.actualizar("SARS", "15/MAY/2023");

        cartilla2.actualizar("Rabia", "12/JUN/2022");
        cartilla2.actualizar("Rabia", "12/JUN/2023");
        cartilla2.actualizar("Rabia", "12/JUN/2024");
        cartilla2.actualizar("Parvovirus", "01/JUL/2022");
        cartilla2.actualizar("SARS", "15/MAY/2023");

        // Imprimir la cartilla de ambos perros
        cartilla1.imprimirCartilla();  
        cartilla2.imprimirCartilla();
        
        // Guardar la cartilla de cada perro en un archivo .txt
        try {
            cartilla1.imprimirExpediente(); // Guardará un archivo "Max.txt"
            cartilla2.imprimirExpediente(); // Guardará un archivo "Rocky.txt"
        } catch (IOException e) {
            System.out.println("Hubo un error al intentar guardar el expediente.");
            e.printStackTrace();
        }
    }
}
