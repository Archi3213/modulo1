package com.anahuac.mayab.modulo1.proyecto;

public class TestVeterinaria {
	
	    public static void main(String[] args) {
	        Perro perro = new Perro("unica", "firulais", "paty");

	        CartillaPerro cartilla = new CartillaPerro(perro, "123");

	        Veterinaria vet = new Veterinaria("Mi veterinaria");
	        // (String tipo, String nombre, String fecha)

	        try {
	            Servicio servicio = vet.crearServicio("baño", perro.getNombre(), "16-nov-2024");
	            servicio.realizar(perro.getNombre());
	        } catch (Exception e) {
	            System.out.println("¡Ese servicio no lo ofrecemos!");
	            e.printStackTrace();
	        }
	    }
	}

}
