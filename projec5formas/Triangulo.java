/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.projec5formas;
import javax.swing.JOptionPane;
/**
 *
 * Kevin Morazan
 */
public class Triangulo extends Figuras {
    
     
    @Override
    public void AreaF()
    {
        System.out.println("Area Del Triangulo");
        Base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Base Del Triangulo"));
        Altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Altura Del Triangulo"));
        Area = (Base * Altura)/2;
        
         System.out.println("Base:" +Base);
         System.out.println("Altura:"+Altura);
         
         System.out.println("Formula: (Base * Altura)/2");
         System.out.println("El Area Del Triangulo Es:" +Area);
        
     }   
         
    
}
