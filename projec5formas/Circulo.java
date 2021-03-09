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
public class Circulo extends Figuras {
    
    @Override
    public void AreaF()
    {
        System.out.println("Area Del Circulo");
        Radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese El Area Del Circulo"));
        Area = Math.PI *Math.pow(Radio, 2);
        
        System.out.println("Radio" +Radio);
        System.out.println("Formula = PI * Radio * 2"  );
        
        System.out.println("El Area Del Circulo Es:" +Area);
    
    }
    
}
