package com.anahuac.mayab.modulo1.proyecto;

public class TestVeterinaria {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Labrador", "Grande", 30.0, "Max", "Carlos P.", 4); // Perro 1
        Perro perro2 = new Perro("Bulldog", "Mediano", 12.5, "Rocky", "Ana L.", 6); // Perro 2  
        CartillaPerro cartilla1 = new CartillaPerro(perro1, "PP00001"); // Cartilla del Perro 1
        CartillaPerro cartilla2 = new CartillaPerro(perro2, "PP00002"); // Cartilla del Perro 2
        Veterinaria vet = new Veterinaria("Estetica Canina/Veterinaria Victorio"); 
        vet.agregarPaciente(cartilla1);
        vet.agregarPaciente(cartilla2);
        
        try {
            // Servicios del perro1
            Servicio servicio = vet.crearServicio("Corte de cabello", perro1.getNombre(), "2022/12/28");
            servicio.realizar(perro1.getNombre());
            Servicio servicio2 = vet.crearServicio("Vacuna puppy", perro1.getNombre(), "2023/10/05");
            servicio2.setCartilla(cartilla1);
            servicio2.realizar(perro1.getNombre());
            cartilla1.imprimirCartilla();
            
            // Servicios del perro2
            Servicio servicio3 = vet.crearServicio("Corte de cabello", perro2.getNombre(), "2023/10/12");
            servicio3.realizar(perro2.getNombre());
            Servicio servicio4 = vet.crearServicio("Vacuna Parvovirus", perro2.getNombre(), "2023/09/15");
            servicio4.setCartilla(cartilla2);
            servicio4.realizar(perro2.getNombre());
            cartilla2.imprimirCartilla();
            
        } catch (Exception e) {
            System.out.println("Servicio invalido");
            e.printStackTrace();
        }
        
        // Llamar al método correcto para imprimir los expedientes
        vet.imprimirExpedientes();
    }
}
