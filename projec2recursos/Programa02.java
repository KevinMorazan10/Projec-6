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
public class Programa02 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollo Del Programa
        
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.print("Escriba Su Edad: ");
        edad = scanner.nextInt();
        
        Metodo02 verificar = new Metodo02();       
        verificar.VerificarEdad(edad);
    
        }
    }
