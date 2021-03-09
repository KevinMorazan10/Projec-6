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
public class Programa04 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodo04 Lista = new Metodo04();
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Escriba Un Numero X De La Lista De Numeros Que Ud Desea Imprimir: ");
        numero = scanner.nextInt();
         
        Lista.ListaDeNumeros(numero);
        
    }
    
}
