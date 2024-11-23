package com.anahuac.mayab.modulo1.proyecto;

public class ServicioEstetico {
	
	public ServicioEstetico(String tipo, double costo, String fecha, String encargado) {
		super (tipo costo, fecha, encargado);
		
	}
public void baniar() {
	System.out.print("bañando");
}
public void cepillar () {
	System.out.print("cepillando");
}

public void cortarUnias() {
	System.out.print("cortar uñas");
}
public void realizar(String nombre) {
	System.out.println("atendiendon a " + nombre);
	baniar();
	cepillar();
	
}
}
