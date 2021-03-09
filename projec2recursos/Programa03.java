/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.projec2recursos;

import java.util.Scanner;

/**
 *
 * POO. Kevin Morazan
 */
public class Programa03 {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollo Del Programa
        
        Scanner scanner = new Scanner(System.in);
        Metodo03 operaciones = new Metodo03();
        int Numero1;
        int Numero2;
        System.out.print("Multiplicacion De Dos Numeros Enteros");
        System.out.print("\n Escriba El Primer Numero: ");
        Numero1 = scanner.nextInt();
        
        System.out.print("\n Escriba El Segundo Numero: ");
        Numero2 = scanner.nextInt();
        
        operaciones.Multiplicar(Numero1, Numero2);
    }
    
}
