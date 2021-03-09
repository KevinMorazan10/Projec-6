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
public class Cuadrado extends Figuras{
    
    @Override
    public void AreaF()
    {
        System.out.println("Area Del Cuadrado");
        Lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese El Lado Del Cuadrado"));
        Area = Lado*Lado;
        
         System.out.println("Lado:" +Lado);
         System.out.println("Formula: Lado*Lado");
         
         System.out.println("El Area Del Cuadrado Es:" +Area);
              
     }    
    
}
