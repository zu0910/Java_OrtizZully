/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslands_erp;

/**
 *
 * @author Uniminuto Tibu
 */
public class Coordinador {
    int id;
    long numeroIdentificacion;
    String nombres;
    String apellidos;
    String direccion;
    long telefonoCelular;
    int telefonoFijo;
    
    public Coordinador () {}

    public Coordinador(int id, long numeroIdentificacion, String nombres, String apellidos, String direccion, long telefonoCelular, int telefonoFijo) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "id=" + id + ", numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefonoCelular=" + telefonoCelular + ", telefonoFijo=" + telefonoFijo + '}';
    }
    
    
}
