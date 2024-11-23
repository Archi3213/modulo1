package com.anahuac.mayab.modulo1.proyecto;

public class ServicioEstetico extends Servicio {

    public ServicioEstetico(String tipo, double costo, String fecha, String encargadoEstetica) {
        super(tipo, costo, fecha, encargadoEstetica);
    }
    
    public void banar() {
        System.out.println("Comenzando baño del paciente...");
    }

    public void cepillar() {
        System.out.println("Cepillando el pelaje con cuidado...");
    }

    public void cortarUnas() {
        System.out.println("Realizando corte de uñas...");
    }

    @Override
    public void realizar(String nombre) {
        System.out.println("Atención estética para: " + nombre);
        banar();
        cepillar();
        cortarUnas();
    }
}
