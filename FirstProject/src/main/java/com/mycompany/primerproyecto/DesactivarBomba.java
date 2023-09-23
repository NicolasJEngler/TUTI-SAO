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
public class DesactivarBomba {
    public static void main(String[] args) {
        // Declara variable para guardado del codigo
        int codigoDesactivacion;
        // Define entrada para permitir el input del usuario
        Scanner entrada = new Scanner( System.in );
        
        // Imprime un mensaje pidiendo el ingreso del codigo
        System.out.println("Ingrese el código de desactivación de la bomba:");
        // Se actualiza el valor de codigoDesactivacion con el valor del usuario
        codigoDesactivacion = entrada.nextInt();
        // Se declara una variable donde el numero esta invertido, 
        // usando invertirNumero() y pasando como parametro codigoDesactivacion
        int invertido = invertirNUmero(codigoDesactivacion);
        
        System.out.println("El código de desactivación real es " + invertido);
    }
    
    // Declaración de una función encargada de invertir ints
    public static int invertirNUmero(int num) {
        // Convierte el int en un string
        String numStr = Integer.toString(num);
        
        // Invierte string usando StringBuilder
        StringBuilder invertidoStr = new StringBuilder(numStr).reverse();
        
        // Convierte el string invertido nuevamente en un int
        int invertido = Integer.parseInt(invertidoStr.toString());
        
        // Devuelve el numero invertido
        return invertido;
    }
}
