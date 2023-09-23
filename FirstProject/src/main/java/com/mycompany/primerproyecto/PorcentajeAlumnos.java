/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto;
import java.util.Scanner;

/**
 *
 * @author nicolasjengler
 */
public class PorcentajeAlumnos {
    public static void main(String[] args) {
        // Declaración de variables para guardar cantidades de varones y mujeres
        int cantVarones;
        int cantMujeres;
        // Declaración de "entrada" instanciando Scanner que permite el input del usuario
        Scanner entrada = new Scanner( System.in );
        
        // Impresión de mensaje pidiendo cant. de mujeres
        System.out.println("Ingrese cantidad de mujeres:");
        // Actualización de cantMujeres con el input del usuario
        cantMujeres = entrada.nextInt();
        
        // Impresión de mensaje pidiendo cant. de varones
        System.out.println("Ingrese cantidad de varones:");
        // Actualización de cantMujeres con el input del usuario
        cantVarones = entrada.nextInt();
        
        // Aplico una regla de 3 para sacar el porcentaje de mujeres
        int porcentajeMujeres = cantMujeres * 100 / (cantVarones + cantMujeres);
        // Por resta saco el porcentajes de varones
        int porcentajeVarones = 100 - porcentajeMujeres;
        
        // Impresión de mensaje con porcentajes de alumnos
        System.out.println("En la comisión hay un " + porcentajeMujeres + "% de mujeres y un " + porcentajeVarones + "% de varones.");
    }
}
