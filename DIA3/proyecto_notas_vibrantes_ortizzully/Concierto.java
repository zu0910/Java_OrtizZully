/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_notas_vibrantes_ortizzully;

/**
 *
 * @author Uniminuto Tibu
 */
public class Concierto {
    int id;
    String nombre;
    String artista;
    String fecha;
    String lugar;
    Double PrecioBase;

    public Concierto(int id, String nombre, String artista, String fecha, String lugar, Double PrecioBase) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.fecha = fecha;
        this.lugar = lugar;
        this.PrecioBase = PrecioBase;
    }

    @Override
    public String toString() {
        return "Concierto{" + "id=" + id + ", nombre=" + nombre + ", artista=" + artista + ", fecha=" + fecha + ", lugar=" + lugar + ", PrecioBase=" + PrecioBase + '}';
    }
    
    
    
}
