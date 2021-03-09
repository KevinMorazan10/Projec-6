/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uth.hn.projec3;

/**
 *
 * POO. Kevin Morazan
 */
public class Programa {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Automovil cars = new Automovil();
      cars.setAutomovil("Hyundai");
      cars.setModelo("Elantra");
      cars.setAño(2021);
      cars.setColor("Azul");
      cars.setCosto("345,000 LPS");
      
    
      System.out.println("Automovil:" + cars.getAutomovil());
      System.out.println("Modelo:" + cars.getModelo());
      System.out.println("Año:" + cars.getAño());
      System.out.println("Color:" + cars.getColor());
      System.out.println("Costo:" + cars.getCosto());
           
    }
    
    
}
