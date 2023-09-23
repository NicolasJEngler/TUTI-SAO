/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerproyecto;
import java.util.Scanner;

/**
 *
 * @author nicolasjengler
 */
public class Primerproyecto {

    public static void main(String[] args) {
        // Declaración de variable para guardado de valor
        int nroLegajo;
        // Declaración de "entrada" instanciando Scanner que permite el input del usuario
        Scanner entrada = new Scanner( System.in );
        
        // Impresión de mensaje
        System.out.println("Me dices tu número de legajo?");
        // Actualización de nroLegajo con el input del usuario
        nroLegajo = entrada.nextInt();
        // Impresión de mensaje concatenando el nuevo valor de nroLegajo
        System.out.println("Ingreso de " + nroLegajo + " al Netbeans!");
    }
}

