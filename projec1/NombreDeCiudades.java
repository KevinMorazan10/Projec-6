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
public class NombreDeCiudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarollo Del Programa
        
       Scanner scanner = new Scanner(System.in);
       String[] Ciudades = new String[20];
       int Contador = 1;
       
       System.out.print("Escriba El Nombre De 20 Ciudades");
        for (int i = 0; i < 20; i++) {
            System.out.print("\n Escriba La Ciudad Número " + Contador + ":" );
            Ciudades[i] = scanner.next();
            Contador= Contador + 1;
        }  
        
        System.out.print("\n Las Ciudades Guardadas Son:");
        for (int i = 0; i <20; i++) {
            System.out.print("\n" + Ciudades[i]);
   
        }
  
   }
    
   
}
