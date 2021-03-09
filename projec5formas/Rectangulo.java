/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.projec5formas;
import javax.swing.JOptionPane;


/**
 *
 * kevin Morazan
 */
public class Rectangulo extends Figuras  {
    
    @Override
    public void AreaF()
    {
        System.out.println("Area Del Circulo");
        Base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Base Del Rectangulo"));
        Altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Altura Del Rectangulo"));
        Area = Base * Altura;
        
         System.out.println("Base:" +Base);
         System.out.println("Altura:"+Altura);
         
          System.out.println("Formula: Base * Altura");
           System.out.println("El Area Del Rectangulo Es");
        
     }   
}
