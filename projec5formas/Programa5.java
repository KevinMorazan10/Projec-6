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
public class Programa5 {
    
    public static void main (String[] args){
        
        int op;
        do
    {
    
    op = Integer.parseInt(JOptionPane.showInputDialog(null,"Calcular El Area De Las Figuras "
            + "Seleccione Una Opcion:\n"
            + " 1. Circulo\n"
            + " 2. Rectangulo\n"
            + " 3. Triangulo\n"
            + " 4. Cuadrado\n"
            + " 5. Salir"));
            
            switch (op)
        {
                case 1:
                    Circulo Nia = new Circulo();
                  Nia.AreaF();
                  System.out.println("");
                    
                    break;
                    
                case 2:
                    Rectangulo Nia1 = new Rectangulo();
                   Nia1.AreaF();
                   System.out.println("");
                    
                    break;
                    
                case 3:
                    Triangulo Nia2 = new Triangulo();
                   Nia2.AreaF();
                   System.out.println("");
                    
                    break;
    
                    
                    case 4:
                    Cuadrado Nia3 = new Cuadrado();
                   Nia3.AreaF();
                   System.out.println("");
                    
                    break;
                    
                    case 5:
                    JOptionPane.showMessageDialog(null,"Que Tenga Buen Dia ");System.exit(0);
                   
                    break;
                    
                   
                    
                    
                    default:JOptionPane.showMessageDialog(null,"Elija Una Opcion Valida ");
                    System.out.println("");

            }
            

            }while(op!=5);
        
}
    }
