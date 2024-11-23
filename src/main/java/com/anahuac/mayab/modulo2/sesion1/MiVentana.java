package com.anahuac.mayab.modulo2.sesion1;

import java.awt.*;
import javax.swing.*;

public class MiVentana extends JFrame {
    private final JButton botonNorte;
    private  final JButton botonSur;
    private final JButton botonEste;
    private final JButton botonOeste;
    private final JButton botonCentro;

    public MiVentana() {
        // Inicialización de los botones
        botonNorte = new JButton("Norte");
        botonSur = new JButton("Sur");
        botonEste = new JButton("Este");
        botonOeste = new JButton("Oeste");
        botonCentro = new JButton("Centro");

        // Agregar los botones al contenedor con BorderLayout
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(botonNorte, BorderLayout.NORTH);
        this.getContentPane().add(botonSur, BorderLayout.SOUTH);
        this.getContentPane().add(botonEste, BorderLayout.EAST);
        this.getContentPane().add(botonOeste, BorderLayout.WEST);
        this.getContentPane().add(botonCentro, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MiVentana miVentana = new MiVentana();
        miVentana.setBounds(100, 100, 400, 300);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}
