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
public class IntercambiarValores {
    public static void main(String[] args) {
        // Declaración de variables para guardado de valores de A y B
        int numeroA;
        int numeroB;
        // Declaración de "entrada" instanciando Scanner que permite el input del usuario
        Scanner entrada = new Scanner( System.in );
        
        // Impresión de mensaje pidiendo valor de A
        System.out.println("Ingrese el valor de A:");
        // Actualización de numeroA con el input del usuario
        numeroA = entrada.nextInt();
        // Impresión de mensaje pidiendo valor de B
        System.out.println("Ingrese el valor de B:");
        // Actualización de numeroB con el input del usuario
        numeroB = entrada.nextInt();
        
        // Declaramos una variable para guardar temporalmente el valor de A
        // antes de intercambiar A y B
        int numeroTemp = numeroA;
                
        // Intercambiamos los valores de A y B
        numeroA = numeroB;
        numeroB = numeroTemp; // numeroTemp === numeroA
        
        // Impresión de mensaje concatenando el nuevo valor de nroLegajo
        System.out.println("--Intercambiamos A y B--");
        System.out.println("A: " + numeroA);
        System.out.println("B: " + numeroB);
    }
}
