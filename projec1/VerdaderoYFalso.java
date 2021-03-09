/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.projec1;

/**
 *
 *  POO. Kevin Morazan
 */
public class VerdaderoYFalso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarollo Del Programa
        
        int M = 6;
        int T = 1;
        int K = -10;
        boolean ResultadoM = false;
        boolean ResultadoT = false;
        boolean ResultadoK = false;
        
        if (M > T) {
        ResultadoM = true;
        }
        
        if (T / K == -5) {
        ResultadoT = true;
        }
        
        if ((M + T == 7)||(M - T == 5)){
            ResultadoK = true;
        }
        
        System.out.print("\n El Resultado Final De M > T Es:" + ResultadoM);
        System.out.print("\n El Resultado Final De T / K == -5 Es:" + ResultadoT);
        System.out.print("\n El Resultado Final De (M + T == 7)||( M - T == 5) Es:" + ResultadoK);
    }
    
}
