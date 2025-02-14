/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoclase;

/**
 *
 * @author Uniminuto Tibu
 */
public class Carro extends Vehiculos{
    // Herencia
    
    private int cilindraje;

    public Carro(int cilindraje, String nombre, String marca, int modelo) {
        super(nombre, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Carro{" + "cilindraje=" + cilindraje + "marca"+super.getMarca()+'}';
    }
    
    
    
    
}
