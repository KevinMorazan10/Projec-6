/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.projec4;


/**
 *
 * Kevin Morazan
 */
public class Programa4 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // Desarrollo 1
        Doctor doctor = new Doctor();
        
      
        // Informacion Sobre El Doctor
        doctor.setNombre("Kevin");
        doctor.setApellido("Morazan");
        doctor.setEdad(25);
        doctor.setAñosDeExperiencia(3);
        
       
        // Detalles Del Doctor
        System.out.println("Nombre Del Doctor:" + doctor.getNombre() + " " + doctor.getApellido());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Años de experiencia: " + doctor.getAñosDeExperiencia());
        
       
        System.out.println();
        // Desarrollo 2
        HospitalEscuela HospitalEscuela = new HospitalEscuela();
        HospitalMaria HospitalMaria = new HospitalMaria();
        HospitalSanJorge HospitalSanJorge = new HospitalSanJorge();
        
        
        // Hospitales Y Su Director
        System.out.println(HospitalEscuela.getNombreDelHospital() + ", director(a): " + HospitalEscuela.getDirector());
        System.out.println(HospitalMaria.getNombreDelHospital() + ", director(a): " + HospitalMaria.getDirector());
        System.out.println(HospitalSanJorge.getNombreDelHospital() + ", director(a): " + HospitalSanJorge.getDirector());

   
    }
    
}