/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslands_erp;



public class Campers {
    int id;
    long numeroIdentificacion;
    String nombres;
    String apellidos;
    String direccion;
    String acudiente;
    long telefonoCelular;
    int telefonoFijo;
    String estado;
    String fechaInicio;
    String fechaCierre;
    String grupo;
    String ruta;
    int moduloActual;
    String trainer;
    String riesgo;
    Double notaFiltro;
    
    
    public Campers ( int id,long numeroIdentificacion,String nombres,String apellidos,
    String direccion,String acudiente,long telefonoCelular,int telefonoFijo,
    String estado,String fechaInicio,String fechaCierre,String grupo,String ruta,
    int moduloActual,String trainer,String riesgo,Double notaFiltro){
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefonoCelular = telefonoCelular;
        this.telefonoFijo = telefonoFijo;
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
        return "Campers{" + "id=" + id + ", numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", acudiente=" + acudiente + ", telefonoCelular=" + telefonoCelular + ", telefonoFijo=" + telefonoFijo + ", estado=" + estado + ", fechaInicio=" + fechaInicio + ", fechaCierre=" + fechaCierre + ", grupo=" + grupo + ", ruta=" + ruta + ", moduloActual=" + moduloActual + ", trainer=" + trainer + ", riesgo=" + riesgo + ", notaFiltro=" + notaFiltro + '}';
    }
    
    void mostrarDatosCamper(){
        System.out.println("----------- DATOS DEL CAMPER -------------");
        System.out.println("Numero de identificacion: " + numeroIdentificacion);
        System.out.println("Nombres: " + nombres );
        System.out.println("Apellidos: " + apellidos );
        System.out.println("Direccion: " + direccion);
        System.out.println("Acudiente: " + acudiente );
        System.out.println("Telefono celular: " + telefonoCelular );
        System.out.println("Telefono fijo: " + telefonoFijo);
        System.out.println("-------------------------------------------");
    }
    
    void mostrarRiesgoCamper() {
        
        System.out.println("Tu riesgo es: " + riesgo);
        
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

