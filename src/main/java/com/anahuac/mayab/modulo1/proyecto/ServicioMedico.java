package com.anahuac.mayab.modulo1.proyecto;

public class ServicioMedico extends Servicio {

    public ServicioMedico(String tipo, double costo, String fecha, String encargado) {
        super(tipo, costo, fecha, encargado);        
    }

    public void consultar(String nombre) { // Recibe el nombre del paciente
        System.out.println("Iniciando consulta médica para: " + nombre);
    }
    
    public void darReceta() {
        System.out.println("Generando receta con las indicaciones necesarias...");
    }

    @Override
    public void realizar(String nombre) { // Implementación de realizar()
        getCartilla().actualizar(getTipo(), getFecha());  // Actualiza la cartilla con el servicio realizado
        consultar(nombre);  // Llama a la consulta
        darReceta();  // Genera la receta
    }

}
