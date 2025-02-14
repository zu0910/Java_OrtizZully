/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoclase;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Uniminuto Tibu
 */
public class TrabajoClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HERENCIA : Permite crear nuevas clases basadas en clases existentes
        
        // ENCAPSULAMIENTO: Ocultar los detalles de implementacion de una clase 
        // y exponer solo una interfaz publica 
        
        // POLIMORFISMO: Permite que objetos de diferentes clases respond de manera similar
        // a un mismo metodo
        
        // ENCAPSULAMIENTO 
        Vehiculos vehiculo1 = new Vehiculos ("Viejo", "Toyota", 2015);
        Vehiculos vehiculo2 = new Vehiculos ();
        
        vehiculo2.setNombre("ambiguo");

        
        // Obtener informacion 
        System.out.println(vehiculo1.getNombre());
       
        // Cambiar informacion 
        vehiculo1.setNombre("Nuevo");
        System.out.println(vehiculo1.getNombre());
        System.out.println(vehiculo1);
        System.out.println(vehiculo2);
    }
    
}
