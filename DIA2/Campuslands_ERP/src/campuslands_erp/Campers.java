/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslands_erp;

import java.util.List;

public class Campers {
    int id;
    User user;
    long numeroIdentificacion;
    String nombres;
    String apellidos;
    String direccion;
    String acudiente;
    long telefonoCelular;
    int telefonoFijo;
    List<String> tiposDeEstados;
    String estado;
    String fechaInicio;
    String fechaCierre;
    String grupo;
    String ruta;
    int moduloActual;
    String trainer;
    List<String> riesgo;
    List<Double> notaFiltro;
    
    public Campers(){}
    public Campers ( int id, User user,long numeroIdentificacion,String nombres,String apellidos,
    String direccion,String acudiente,long telefonoCelular,int telefonoFijo,List<String> tiposDeEstados,
    String estado,String fechaInicio,String fechaCierre,String grupo,String ruta,
    int moduloActual,String trainer,List<String> riesgo,List<Double> notaFiltro){
        this.id = id;
        this.user = user;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
        this.tiposDeEstados = tiposDeEstados;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.grupo = grupo;
        this.ruta = ruta;
        this.moduloActual = moduloActual;
        this.trainer = trainer;
        this.riesgo = riesgo;
        this.notaFiltro = notaFiltro;
    }

    @Override
    public String toString() {
        return "Campers{" + "id=" + id + ", user=" + user + ", numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", acudiente=" + acudiente + ", telefonoCelular=" + telefonoCelular + ", telefonoFijo=" + telefonoFijo + ", tiposDeEstados=" + tiposDeEstados + ", estado=" + estado + ", fechaInicio=" + fechaInicio + ", fechaCierre=" + fechaCierre + ", grupo=" + grupo + ", ruta=" + ruta + ", moduloActual=" + moduloActual + ", trainer=" + trainer + ", riesgo=" + riesgo + ", notaFiltro=" + notaFiltro + '}';
    }
    
    void mostrarDatosCamper(){
        System.out.println("---------DATOS DEL CAMPER----------");
        System.out.println("Numero de identificacion: " + numeroIdentificacion);
        System.out.println("Nombres: " + nombres );
        System.out.println("Apellidos: " + apellidos );
        System.out.println("Direccion: " + direccion);
        System.out.println("Acudiente: " + acudiente );
        System.out.println("Telefono celular: " + telefonoCelular );
        System.out.println("Telefono fijo: " + telefonoFijo);
    }
    
    void mostrarRiesgoCamper() {
        if (estado.equals("Aprobado") || estado.equals("Cursado")){
            System.out.println("Tu riesgo es: " + riesgo.get(moduloActual -1));
        } else {
            System.out.println("Tu estado es: " + estado + ", por lo tanto no tienes riego.");
        }
    }
    
    void mostrarRutaCamper(){
        System.out.println("Tu ruta es: "+ ruta);
    }
    
    void mostrarTrainerCamper(){
        System.out.println("Tu trainer es: "+ trainer);
    }
    
    void mostrarModuloCamper(){
        System.out.println("Estas en el modulo : "+ moduloActual);
    }
}

