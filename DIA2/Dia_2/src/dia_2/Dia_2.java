/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia_2;

import java.util.ArrayList;

/**
 *
 * @author Uniminuto Tibu
 */
public class Dia_2 {

    /* P.O.O
    Es un paradigma de programacion que parte del concepto de "objetos" como base, conteniendo 
    informacion en forma de campos y codigo en forma de metodos.
     */
    public static void main(String[] args) {
        // Instanciar la clase "carro"
        
        Carro carrito1 = new Carro();
        Carro carrito2 = new Carro("Audi", "A4", 2025);
        Carro carrito3 = new Carro("Toyota", "Tundra",2025, "Diesel", 1000, 2800, 5, 7, "Petroleo negro", 5);
        System.out.println(carrito1);
        System.out.println(carrito2);
        System.out.println(carrito3);
        
        // Asignar valores a un objeto 
        
        carrito1.modelo = "Twingo";
        carrito1.marca = "Renault";
        
        System.out.println(carrito1);
        System.out.println(carrito1.modelo);
        
        ArrayList<Carro> listaCarro = new ArrayList<>();
        System.out.println(listaCarro);
        listaCarro.add(carrito1);
        listaCarro.add(carrito2);
        listaCarro.add(carrito3);
        
        System.out.println(listaCarro);
        System.out.println(listaCarro.get(2));
        
        Carro carroTemporal = new Carro();
        carroTemporal = listaCarro.get(2);
        System.out.println(carroTemporal.marca);
        
        for (int i = 0; i < listaCarro.size(); i++){
            System.out.println(listaCarro.get(i).marca);
        }
    }
    
}
