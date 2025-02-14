/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoclase;

/**
 *
 * @author Uniminuto Tibu
 */
public class Vehiculos {
    
    // encapsulamiento va privado 
    private String nombre;
    private String marca;
    private int modelo;

    public Vehiculos() {
    }

    public Vehiculos(String nombre, String marca, int modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    // Como esta en capsulamiento se debe hacer esta manera para poderlo mostrar o actualizar
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    
    
}
