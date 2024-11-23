package com.anahuac.mayab.modulo1.sesion3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Crear 5 perros
        Perro perro1 = new Perro("Max", "Carlos", 4);
        Perro perro2 = new Perro("Bobby", "Ana", 3);
        Perro perro3 = new Perro("Rex", "Luis", 5);
        Perro perro4 = new Perro("Fido", "María", 2);
        Perro perro5 = new Perro("Rocky", "Pedro", 6);

        // 1. Arreglo simple
        Perro[] misPerros = new Perro[5];
        misPerros[0] = perro1;
        misPerros[1] = perro2;
        misPerros[2] = perro3;
        misPerros[3] = perro4;
        misPerros[4] = perro5;

        System.out.println("Iterando sobre el arreglo:");
        for (int i = 0; i < misPerros.length; i++) {
            misPerros[i].ladrar();
        }

        // 2. ArrayList
        ArrayList<Perro> listaPerros = new ArrayList<>();
        listaPerros.add(perro1);
        listaPerros.add(perro2);
        listaPerros.add(perro3);
        listaPerros.add(perro4);
        listaPerros.add(perro5);

        System.out.println("\nIterando sobre el ArrayList:");
        for (Perro perro : listaPerros) {
            perro.ladrar();
        }

        // 3. HashMap
        HashMap<Integer, Perro> mapPerros = new HashMap<>();
        mapPerros.put(1, perro1);
        mapPerros.put(2, perro2);
        mapPerros.put(3, perro3);
        mapPerros.put(4, perro4);
        mapPerros.put(5, perro5);

        System.out.println("\nIterando sobre el HashMap:");
        for (Integer key : mapPerros.keySet()) {
            mapPerros.get(key).ladrar();
        }
    }
}
