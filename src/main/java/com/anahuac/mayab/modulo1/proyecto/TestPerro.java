package com.anahuac.mayab.modulo1.proyecto;

public class TestPerro {

	
public static void main(String[]args) {


Perro perro1 = new Perro();

Perro 	perro2 = new Perro( "desconocida", "pequeño", 10.5, "firulais", "pepe", 2);

		System.out.println("El perro 1 se llama:" + perro1.getNombre());
		
		System.out.println("El perro 2 se llama:" + perro2.getNombre());

		perro1.setNombre("solovino");
		
		System.out.println(" el perro1 se llam:" + perro1.getNombre());
}

}
