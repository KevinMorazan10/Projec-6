/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.projec1;

import java.util.Scanner;

/**
 *
 * POO. Kevin Morazan
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarollo Del Programa
        
        float Numero1;
        float Numero2;
        float Resultado;
        String Leer;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba El Primer Numero\n");
        Numero1 = scanner.nextFloat();
          
        System.out.println("Escriba El Segundo Numero\n");
        Numero2 = scanner.nextFloat();
        
        //Suma
        Resultado = Numero1 + Numero2;
        System.out.println("\n El Resultado Final De La Siguiente Suma Es: "+ Resultado);
        
        //Resta
        Resultado = Numero1 - Numero2;
        System.out.println("\n El Resultado Final De La Siguiente Resta Es: "+ Resultado);
        
        //Multiplicacion
        Resultado = Numero1 * Numero2;
        System.out.println("\n El Resultado Final De La Siguiente Multiplicación Es: "+ Resultado);
        
        // Division
        Resultado = Numero1 / Numero2;
        System.out.println("\n El Resultado Final De La Siguiente División Es: "+ Resultado);
    }
    
}
