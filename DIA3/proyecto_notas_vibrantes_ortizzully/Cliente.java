/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_notas_vibrantes_ortizzully;

/**
 *
 * @author Uniminuto Tibu
 */
public class Cliente {
    int id;
    String nombre;
    String apellido;
    String correo;
    long telefono;

    public Cliente(int id, String nombre, String apellido, String correo, long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
