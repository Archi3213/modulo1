package com.anahuac.mayab.modulo1.proyecto;

import java.util.ArrayList;

public class Veterinaria {
    private String nombre;
    private ArrayList<CartillaPerro> listaPacientes = new ArrayList<>();
    
    public Veterinaria(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Servicio crearServicio(String tipo, String nombrePerro, String fecha) throws Exception {
        Servicio servicio = null;
        
        if(tipo.equals("Corte de cabello") || tipo.equals("Vacuna puppy") || tipo.equals("Vacuna Parvovirus")) {
        
            if (tipo.equals("Corte de cabello")) {
                servicio = new ServicioEstetico(tipo, 250, fecha, "encargadoEstetica");
            } else if (tipo.startsWith("Vacuna")) {
                servicio = new ServicioMedico(tipo, 500, fecha, "veterinario");
            }
        } else {
            throw new Exception("No existe ese servicio");
        }
        return servicio;
    }
    
    public void agregarPaciente(CartillaPerro cartilla) {
        listaPacientes.add(cartilla);
    }
    
    public void imprimirCartilla() {
        for (CartillaPerro c : listaPacientes) {
            c.imprimirCartilla();
        }
    }
}
