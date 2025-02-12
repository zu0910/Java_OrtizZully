/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslands_erp;

/**
 *
 * @author Uniminuto Tibu
 */
public class Trainers {
    int id;
    long numeroIdentificacion;
    String nombres;
    String apellidos;
    String direccion;
    long telefonoCelular;
    int telefonoFijo;
    String ruta;
    String grupo;
    
    Trainers () {}

    public Trainers(int id, long numeroIdentificacion, String nombres, String apellidos, String direccion, long telefonoCelular, int telefonoFijo, String ruta, String grupo) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
        this.ruta = ruta;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Trainers{" + "id=" + id + ", numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefonoCelular=" + telefonoCelular + ", telefonoFijo=" + telefonoFijo + ", ruta=" + ruta + ", grupo=" + grupo + '}';
    }
    
    void mostrarInfoTrainer(){
        System.out.println("----------- DATOS DEL TRAINER -------------");
        System.out.println("Numero de identificacion: " + numeroIdentificacion);
        System.out.println("Nombres: " + nombres );
        System.out.println("Apellidos: " + apellidos );
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono celular: " + telefonoCelular );
        System.out.println("Telefono fijo: " + telefonoFijo);
        System.out.println("-------------------------------------------");
    }
    
    void mostrarRuta(){
        System.out.println("Ruta: " + ruta);
    }
    
    void mostrarGrupo(){
        System.out.println("grupo: " + grupo);
    }
    
     
}
