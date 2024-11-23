package com.anahuac.mayab.modulo1.proyecto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro {
    // Atributos
    private Perro datosPerro;
    private String idCartilla;
    HashMap<String, ArrayList<String>> vacunas = new HashMap<>();

    // Constructores
    public CartillaPerro() {
    }

    public CartillaPerro(Perro datosPerro, String idCartilla) {
        this.datosPerro = datosPerro;
        this.idCartilla = idCartilla;
    }

    // Getters y setters
    public Perro getDatosPerro() {
        return datosPerro;
    }

    public void setDatosPerro(Perro datosPerro) {
        this.datosPerro = datosPerro;
    }

    public String getIdCartilla() {
        return idCartilla;
    }

    public void setIdCartilla(String idCartilla) {
        this.idCartilla = idCartilla;
    }

    public HashMap<String, ArrayList<String>> getVacunas() {
        return vacunas;
    }

    public void setVacunas(HashMap<String, ArrayList<String>> vacunas) {
        this.vacunas = vacunas;
    }

    // Actualiza las vacunas del perro
    public void actualizar(String nombreVacuna, String fechaAplicacion) {
        if (vacunas.containsKey(nombreVacuna)) {
            ArrayList<String> fechas = vacunas.get(nombreVacuna);
            fechas.add(fechaAplicacion);
            vacunas.put(nombreVacuna, fechas);
        } else { // Si la vacuna no existe, la agrega
            ArrayList<String> fechas = new ArrayList<>();
            fechas.add(fechaAplicacion);
            vacunas.put(nombreVacuna, fechas);
        }
    }

    // Imprime la cartilla en consola
    public void imprimirCartilla() {
        System.out.println("---- Datos Perro -----");
        System.out.println(datosPerro.toString());
        System.out.println("------------");
        for (String vacuna : vacunas.keySet()) {
            System.out.println("Vacuna : " + vacuna);
            ArrayList<String> fechas = vacunas.get(vacuna);
            for (String fecha : fechas) {
                System.out.println("Fecha : " + fecha);
            }
            System.out.println("------------");
        }
    }

    // Imprime la cartilla en un archivo .txt
    public void imprimirExpediente() throws IOException {
        String nombreArchivo = datosPerro.getNombre() + ".txt";
        
        // Mostrar el directorio actual para saber dónde se guardará el archivo
        System.out.println("Archivo se guardará en: " + System.getProperty("user.dir"));
        
        FileWriter archivo = null;
        try {
            archivo = new FileWriter(nombreArchivo);
            PrintWriter pw = new PrintWriter(archivo);

            pw.println("---- Datos Perro -----");
            pw.println(datosPerro.toString());
            pw.println("------------");
            for (String vacuna : vacunas.keySet()) {
                pw.println("Vacuna : " + vacuna);
                ArrayList<String> fechas = vacunas.get(vacuna);
                for (String fecha : fechas) {
                    pw.println("Fecha : " + fecha);
                }
                pw.println("------------");
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Hubo un problema al intentar crear el archivo: " + nombreArchivo);
            e.printStackTrace();
        } finally {
            if (archivo != null) {
                try {
                    archivo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

