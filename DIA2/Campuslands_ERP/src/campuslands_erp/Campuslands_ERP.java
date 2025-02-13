/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campuslands_erp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author const
 */
public class Campuslands_ERP {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Crear un camper
        
        Campers camper1 = new Campers (5708,  10939352265L , "Luis Jose","Bemon Henao","Diocesano","Franklin Henao",322890392,3452331,
                "Cursando", "19-03-2024", "19-03-2025", "M1", "JavaScript",
                1, "", "Bajo", 4.2);
        
        // Lista para almacenar campers
        
        ArrayList<Campers> campersList = new ArrayList<>();
        campersList.add(camper1); // Agregar a la lista el camper creado 
        
        
        // Crear un trainer
        
        Trainers trainer1 = new Trainers (1234, 10923445837L,"Pedro jose", "Perez Sanchez", "Bogota", 326659882L, 234567,"Java", "T1");
        
        // Lista para almacenar Trainer
        
        ArrayList<Trainers> trainersList = new ArrayList<>();
        trainersList.add(trainer1); // Agregar a la lista el trainer creado 
        
        // Crear un Coordinador 
        
        Coordinador coordinador1 = new Coordinador (1254, 912837128745L,"Brayan Stiven", "Carvajal Romero", "Bucaramanga", 3278293845L,  1230989);
        
        // Lisra para almacenar 

        ArrayList<Coordinador> coordinadorList = new ArrayList<>();
        coordinadorList.add(coordinador1); // Agregar a la lista el coordinador creado 
        
        boolean finalizar = false;
        
        while (!finalizar){
            System.out.println("-------- BIENVENIDOS A CAMPUSLANDS ----------");
            System.out.println("1). Camper.");
            System.out.println("2). Trainer.");
            System.out.println("3). Coordinador.");
            System.out.println("4). Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese su opciÃ³n: ");
            int opc = scanner.nextInt();
            scanner.nextLine();
            
            switch (opc) {
                case 1:
                    boolean salir = false;
        
                    while (!salir){
                        System.out.println("---- BIENVENIDO CAMPER--------");
                        System.out.println("1). Reportes");
                        System.out.println("2). Cambiar informaciÃ³n.");
                        System.out.println("3). Salir");
                        System.out.println("------------------------------");
                        System.out.println("Ingrese su opciÃ³n: ");
                        
                        int opcion = scanner.nextInt();
                        scanner.nextLine(); 

                        switch (opcion){
                            case 1:
                                boolean salir1 = false;
                                while (!salir1) {
                                    System.out.println("\n ------------- REPORTES --------------------");
                                    System.out.println("1). Mostrar datos del camper.");
                                    System.out.println("2). Riesgo del camper.");
                                    System.out.println("3). Ruta del camper.");
                                    System.out.println("4). Trainer del camper.");
                                    System.out.println("5). Modulo en el que se encuentra el camper.");
                                    System.out.println("6). Salir.");
                                    System.out.println("-----------------------------------------------");
                                    System.out.println("Ingrese su opciÃ³n: ");
                                    int opcion1 = scanner.nextInt();
                                    scanner.nextLine(); 

                                    switch (opcion1) {
                                        case 1:
                                            camper1.mostrarDatosCamper();
                                            break;
                                        case 2:
                                            camper1.mostrarRiesgoCamper();
                                            break;
                                        case 3:
                                            camper1.mostrarRutaCamper();
                                            break;
                                        case 4:
                                            camper1.mostrarTrainerCamper();
                                            break;
                                        case 5:
                                            camper1.mostrarModuloCamper();
                                            break;
                                        case 6:
                                            salir1 = true;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida.");

                                    }
                                }

                            case 2:
                                boolean salir2 = false;
                                while (!salir2){
                                    System.out.println("\n ------ CAMBIAR INFORMACION -------");
                                    System.out.println("1). Cambiar direcciÃ³n.");
                                    System.out.println("2). Cambiar telefono movil.");
                                    System.out.println("3). Cambiar telefono fijo.");
                                    System.out.println("4). Salir.");
                                    System.out.println("-------------------------------------");
                                    System.out.println("Ingrese su opciÃ³n: ");
                                    int opcion2 = scanner.nextInt();
                                    scanner.nextLine(); 

                                    switch (opcion2){
                                        case 1:
                                            System.out.println("Ingrese la nueva direccion: ");
                                            String nuevaDireccion = scanner.nextLine();
                                            camper1.direccion = nuevaDireccion;
                                            System.out.println("Direccion actualizada correctamente");
                                            break;

                                        case 2:
                                            System.out.println("Ingrese el nuevo telefono movil: ");
                                            long nuevoTelefono = scanner.nextLong();
                                            camper1.telefonoCelular = nuevoTelefono;
                                            System.out.println("Telefono movil actualizado correctamente.");
                                            break;

                                        case 3:
                                            System.out.println("Ingrese el nuevo telefono fijo: ");
                                            int nuevoTelefonoFijo = scanner.nextInt();
                                            camper1.telefonoFijo = nuevoTelefonoFijo;
                                            System.out.println("Telefono movil actualizado correctamente.");
                                            break;

                                        case 4:
                                            salir2 = true;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                }
                                break;
                            case 3:
                                
                                salir = true;
                                break;
                                
                            default:
                                System.out.println("Opcion no valida.");

                        }

                    }
                    break;
                case 2:
                    boolean salir3 = false;
                    
                    while (!salir3){
                        System.out.println("---- BIENVENIDO TRAINER --------");
                        System.out.println("1). Informacion personal");
                        System.out.println("2). Cambiar informaciÃ³n.");
                        System.out.println("3). Ruta de entrenamiento.");
                        System.out.println("4). Grupo asignacion. ");
                        System.out.println("5). Salir");
                        System.out.println("------------------------------");
                        System.out.println("Ingrese su opciÃ³n: ");
                        
                        int opcion3 = scanner.nextInt();
                        scanner.nextLine();
                        
                        switch (opcion3){
                            case 1:
                                trainer1.mostrarInfoTrainer();
                                break;
                            case 2:
                                boolean salir4 = false;
                                while (!salir4){
                                    System.out.println("\n ------ CAMBIAR INFORMACION -------");
                                    System.out.println("1). Cambiar direcciÃ³n.");
                                    System.out.println("2). Cambiar telefono movil.");
                                    System.out.println("3). Cambiar telefono fijo.");
                                    System.out.println("4). Salir.");
                                    System.out.println("-------------------------------------");
                                    System.out.println("Ingrese su opciÃ³n: ");
                                    int opcion4 = scanner.nextInt();
                                    scanner.nextLine(); 

                                    switch (opcion4){
                                        case 1:
                                            System.out.println("Ingrese la nueva direccion: ");
                                            String nuevaDireccion1 = scanner.nextLine();
                                            trainer1.direccion = nuevaDireccion1;
                                            System.out.println("Direccion actualizada correctamente");
                                            break;

                                        case 2:
                                            System.out.println("Ingrese el nuevo telefono movil: ");
                                            long nuevoTelefono1 = scanner.nextLong();
                                            trainer1.telefonoCelular = nuevoTelefono1;
                                            System.out.println("Telefono movil actualizado correctamente.");
                                            break;

                                        case 3:
                                            System.out.println("Ingrese el nuevo telefono fijo: ");
                                            int nuevoTelefonoFijo1 = scanner.nextInt();
                                            trainer1.telefonoFijo = nuevoTelefonoFijo1;
                                            System.out.println("Telefono movil actualizado correctamente.");
                                            break;

                                        case 4:
                                            salir4 = true;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                }
                                break;
                            case 3:
                                trainer1.mostrarRuta();
                                break;
                                
                            case 4:
                                trainer1.mostrarGrupo();
                                break;
                                
                            case 5:
        
                                salir3 = true;
                                break;
                            
                            default: 
                                System.out.println("Opcion no valida.");
                                
                        }
                        
                    }
                    
                    break;
                case 3:
                        System.out.println("---- BIENVENIDO COORDINADOR --------");
                        System.out.println("1). Litar campers.");
                        System.out.println("2). Actualizar camper.");
                        System.out.println("3). Registrar un camper.");
                        System.out.println("4). Eliminar un camper. ");
                        System.out.println("5). Listar trainers.");
                        System.out.println("6). Actualizar trainers.");
                        System.out.println("7). Registrar un trainers.");
                        System.out.println("8). Eliminar un trainers. ");
                        System.out.println("9). Listar coordinador.");
                        System.out.println("10). Actualizar coordinador.");
                        System.out.println("11). Registrar un coordinador.");
                        System.out.println("12). Eliminar un coordinador. ");
                        System.out.println("13). Salir");
                        System.out.println("------------------------------");
                        System.out.println("Ingrese su opciÃ³n: ");
                        
                        int opcion5 = scanner.nextInt();
                        scanner.nextLine();
                        
                        boolean salir5 = false;
                        while (!salir5){
                            switch(opcion5){
                                case 1:
                                    System.out.println("-------------- CAMPERS ---------------");
                                    camper1.mostrarDatosCamper();
                                    break;
                                case 2:
                                    boolean salir6 = false;
                                    while (!salir6){
                                        System.out.println("------------- ¿Que dato te gustaria actualizar?-----------");
                                        System.out.println("1). Nombres");
                                        System.out.println("2. Apellidos.");
                                        System.out.println("3. direccion.");
                                        System.out.println("4. Acudiente. ");
                                        System.out.println("5. Telefono Celular");
                                        System.out.println("6. Telefono Fijo");
                                        System.out.println("7. Estado");
                                        System.out.println("8. Fecha de inicio.");
                                        System.out.println("9. Fecha cierre.");
                                        System.out.println("10. Grupo");
                                        System.out.println("11. Ruta");
                                        System.out.println("12. Modulo Actual.");
                                        System.out.println("13. Trainer.");
                                        System.out.println("14. Riesgo.");
                                        System.out.println("15. nota filtro");
                                        System.out.println("16. Salir.");
                                        System.out.println("------------------------------------------------------------");
                                        
                                        int opcion6 = scanner.nextInt();
                                        scanner.nextLine();
                                        
                                        switch(opcion6){
                                            case 1:
                                                System.out.println("Ingrese los nuevos nombres: ");
                                                String nuevoNombre = scanner.nextLine();
                                                camper1.nombres = nuevoNombre;
                                                System.out.println("Nombres actualizados correctamente");
                                                break;
                                            case 2:
                                                System.out.println("Ingrese los nuevos apellidos: ");
                                                String nuevoApellidos = scanner.nextLine();
                                                camper1.apellidos = nuevoApellidos;
                                                System.out.println("Apellidos actualizados correctamente");
                                                break;
                                            case 3:
                                                System.out.println("Ingrese la nueva direccion: ");
                                                String nuevaDireccion = scanner.nextLine();
                                                camper1.direccion = nuevaDireccion;
                                                System.out.println("Direccion actualizada correctamente");
                                                break;
                                            case 4:
                                                System.out.println("Ingrese el nuevo acudiente: ");
                                                String nuevoAcudiente = scanner.nextLine();
                                                camper1.acudiente = nuevoAcudiente;
                                                System.out.println("Acudiente actualizado correctamente");
                                                break;    
                                            case 5:
                                                System.out.println("Ingrese el nuevo telefono Celular: ");
                                                long nuevoTelefono = scanner.nextLong();
                                                camper1.telefonoCelular = nuevoTelefono;
                                                System.out.println("Telefono movil actualizado correctamente.");
                                                break;    
                                            case 6:
                                                System.out.println("Ingrese el nuevo telefono fijo: ");
                                                int nuevoTelefonoFijo = scanner.nextInt();
                                                camper1.telefonoFijo = nuevoTelefonoFijo;
                                                System.out.println("Telefono movil actualizado correctamente.");
                                                break;
                                            case 7:
                                                System.out.println("Ingrese el nuevo estado: ");
                                                String nuevoEstado = scanner.nextLine();
                                                camper1.estado = nuevoEstado;
                                                System.out.println("Estado actualizado correctamente");
                                                break;    
                                            case 8:
                                                System.out.println("Ingrese la fecha de inicio nuevo: ");
                                                String nuevaFechaIni = scanner.nextLine();
                                                camper1.fechaInicio = nuevaFechaIni;
                                                System.out.println("Fecha inicio actualizada correctamente");
                                                break;    
                                            case 9:
                                                System.out.println("Ingrese la fecha cierre nuevo: ");
                                                String nuevaFechaFin = scanner.nextLine();
                                                camper1.fechaCierre = nuevaFechaFin;
                                                System.out.println("Direccion actualizada correctamente");
                                                break;    
                                            case 10:
                                                System.out.println("Ingrese el nuevo grupo: ");
                                                String nuevoGrupo = scanner.nextLine();
                                                camper1.grupo = nuevoGrupo;
                                                System.out.println("Grupo actualizada correctamente");
                                                break;    
                                            case 11:
                                                System.out.println("Ingrese la nueva ruta: ");
                                                String nuevaRuta = scanner.nextLine();
                                                camper1.ruta = nuevaRuta;
                                                System.out.println("Ruta actualizada correctamente");
                                                break;    
                                            case 12:
                                                System.out.println("Ingrese el nuevo modulo actual: ");
                                                int nuevoModulo = scanner.nextInt();
                                                camper1.moduloActual = nuevoModulo;
                                                System.out.println("Modulo actualizado correctamente");
                                                break;    
                                            case 13:
                                                System.out.println("Ingrese la nuevo trainer: ");
                                                String nuevoTrainer = scanner.nextLine();
                                                camper1.trainer = nuevoTrainer;
                                                System.out.println("Trainer actualizado correctamente");
                                                break;   
                                            case 14:
                                                System.out.println("Ingrese el nuevo riesgo: ");
                                                String nuevoRiesgo = scanner.nextLine();
                                                camper1.riesgo = nuevoRiesgo;
                                                System.out.println("Riesgo actualizada correctamente");
                                                break;
                                            case 15:
                                                System.out.println("Ingrese la nueva nota de filtro: ");
                                                Double nuevaNota = scanner.nextDouble();
                                                camper1.notaFiltro = nuevaNota;
                                                System.out.println("Direccion actualizada correctamente");
                                                break;
                                            case 16:
                                                salir6 = true;
                                                break;
                                        }
                                        
                                    }
                                    
                                    break;
                                case 3:
                                    System.out.println("Ingresa los datos del nuevo camper: ");
                                    
                                    System.out.println("Id:");
                                    int id = scanner.nextInt();
                                    scanner.nextLine();
                                    
                                    System.out.println("Numero de identificacion:");
                                    long numeroIdentificacion = scanner.nextLong();
                                    scanner.nextLine();
                                    
                                    System.out.println("Nombres:");
                                    String nombres = scanner.nextLine();
                                    
                                    System.out.println("Apellidos:");
                                    String apellidos = scanner.nextLine();
                                    
                                    System.out.println("Direccion:");
                                    String direccion = scanner.nextLine();
                                    
                                    System.out.println("Acudiente:");
                                    String acudiente = scanner.nextLine();
                                    
                                    System.out.println("Telefono celular:");
                                    long telefonoCelular = scanner.nextLong();
                                    scanner.nextLine();
                                    
                                    System.out.println("Telefono fijo:");
                                    int telefonoFijo = scanner.nextInt();
                                    scanner.nextLine();
                                    
                           
                                    System.out.println("Estado:");
                                    String estado = scanner.nextLine();
                                    
                                    System.out.println("Fecha de inicio:");
                                    String fechaInicio = scanner.nextLine();
                                    
                                    System.out.println("Fecha fin:");
                                    String fechaCierre = scanner.nextLine();
                                    
                                    System.out.println("Grupo en la cual pertenece:");
                                    String grupo = scanner.nextLine();
                                    
                                    System.out.println("Ruta en la que pertenece:");
                                    String ruta = scanner.nextLine();
                                    
                                    System.out.println("Modulo actual: ");
                                    int moduloActual = scanner.nextInt();
                                    scanner.nextLine();
                                    
                                    System.out.println("Trainer del camper:");
                                    String trainer = scanner.nextLine();
                                    
                                    System.out.println("Riesgo del camper:");
                                    String riesgo = scanner.nextLine();
                                    
                                    System.out.println("Nota de filtro:");
                                    double notaFiltro = scanner.nextDouble();
                                    scanner.nextLine();
                                    
                                    Campers nuevoCamper = new Campers(id,numeroIdentificacion, nombres, apellidos, direccion, acudiente, telefonoCelular, telefonoFijo,
                                    estado, fechaInicio, fechaCierre, grupo, ruta,moduloActual, trainer, riesgo,notaFiltro);
                                    
                                    campersList.add(nuevoCamper);
                                    System.out.println(campersList);
                                   
                              
                                    System.out.println("El camper fue registrado con exito.");
                                    break;
                                case 4:
                                    System.out.println("¿Que camper quieres eliminar? Ingresa sus nombres: ");
                                    scanner.nextLine();
                                    String elimina = scanner.nextLine();
                                    boolean delete = false;
                                    for (int i = 0; i < campersList.size(); i++){
                                        if (campersList.get(i).nombres.equalsIgnoreCase(elimina)){
                                            campersList.remove(i);
                                            delete = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    trainer1.mostrarInfoTrainer();
                                    break;
                                case 6:
                                    System.out.println("Ingresa los datos del nuevo trainer: ");
                                    
                                    System.out.println("Id:");
                                    int id1 = scanner.nextInt();
                                    scanner.nextLine();
                                    
                                    System.out.println("Numero de identificacion:");
                                    long numeroIdentificacion1 = scanner.nextLong();
                                    scanner.nextLine();
                                    
                                    System.out.println("Nombres:");
                                    String nombres1 = scanner.nextLine();
                                    
                                    System.out.println("Apellidos:");
                                    String apellidos1 = scanner.nextLine();
                                    
                                    System.out.println("Direccion:");
                                    String direccion1 = scanner.nextLine();
                                    
                                    System.out.println("Telefono celular:");
                                    long telefonoCelular1 = scanner.nextLong();
                                    scanner.nextLine();
                                    
                                    System.out.println("Telefono fijo:");
                                    int telefonoFijo1 = scanner.nextInt();
                                    scanner.nextLine();
                                    
                                    System.out.println("Ruta:");
                                    String ruta1 = scanner.nextLine();
                                    
                                    System.out.println("Grupo:");
                                    String grupo1 = scanner.nextLine();
                                    
                                    Trainers nuevoTrainer = new Trainers(id1,numeroIdentificacion1, nombres1, apellidos1, direccion1, telefonoCelular1, telefonoFijo1,
                                    ruta1, grupo1);
                                    
                                    trainersList.add(nuevoTrainer);
                                    System.out.println(trainersList);
                                   
                                    
                                    System.out.println("El Treiner fue registrado con exito.");
                                    break;
                                case 7:
                                    
                                    boolean salir7 = false;
                                    while (!salir7){
                                        System.out.println("------------- ¿Que dato te gustaria actualizar del Trainer?-----------");
                                        System.out.println("1). Nombres");
                                        System.out.println("2). Apellidos.");
                                        System.out.println("3). direccion.");
                                        System.out.println("4). Telefono Celular");
                                        System.out.println("5). Telefono Fijo");
                                        System.out.println("6). Ruta");
                                        System.out.println("7). Grupo");
                                        System.out.println("8). Salir.");
                                        System.out.println("------------------------------------------------------------");
                                        
                                        int opcion7 = scanner.nextInt();
                                        scanner.nextLine();
                                        
                                        switch(opcion7){
                                            case 1:
                                                System.out.println("Ingrese los nuevos nombres: ");
                                                String nuevoNombre = scanner.nextLine();
                                                trainer1.nombres = nuevoNombre;
                                                System.out.println("Nombres actualizados correctamente");
                                                break;
                                            case 2:
                                                System.out.println("Ingrese los nuevos apellidos: ");
                                                String nuevoApellidos = scanner.nextLine();
                                                trainer1.apellidos = nuevoApellidos;
                                                System.out.println("Apellidos actualizados correctamente");
                                                break;
                                            case 3:
                                                System.out.println("Ingrese la nueva direccion: ");
                                                String nuevaDireccion = scanner.nextLine();
                                                trainer1.direccion = nuevaDireccion;
                                                System.out.println("Direccion actualizada correctamente");
                                                break;  
                                            case 4:
                                                System.out.println("Ingrese el nuevo telefono Celular: ");
                                                long nuevoTelefono = scanner.nextLong();
                                                trainer1.telefonoCelular = nuevoTelefono;
                                                System.out.println("Telefono movil actualizado correctamente.");
                                                break;    
                                            case 5:
                                                System.out.println("Ingrese el nuevo telefono fijo: ");
                                                int nuevoTelefonoFijo = scanner.nextInt();
                                                trainer1.telefonoFijo = nuevoTelefonoFijo;
                                                System.out.println("Telefono movil actualizado correctamente.");
                                                break;   
                                            case 6:
                                                System.out.println("Ingrese la nueva ruta: ");
                                                String nuevaRuta = scanner.nextLine();
                                                trainer1.ruta = nuevaRuta;
                                                System.out.println("Ruta actualizada correctamente");
                                                break;
                                            case 7:
                                                System.out.println("Ingrese el nuevo grupo: ");
                                                String nuevoGrupo = scanner.nextLine();
                                                trainer1.grupo = nuevoGrupo;
                                                System.out.println("Grupo actualizada correctamente");
                                                break;  
                                            case 8:
                                                salir7 = true;
                                                break;
                                        }
                                    }
                                    break;
                                case 8:
                                    System.out.println("¿Que Trainer quieres eliminar? Ingresa sus nombres: ");
                                    scanner.nextLine();
                                    String elimina1 = scanner.nextLine();
                                    boolean delete1 = false;
                                    for (int i = 0; i < trainersList.size(); i++){
                                        if (trainersList.get(i).nombres.equalsIgnoreCase(elimina1)){
                                            trainersList.remove(i);
                                            delete1 = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 9:
                                    coordinador1.mostrarInfoCoordi();
                                    break;
                                case 10:
                                    boolean salir8 = false;
                                    while (!salir8){
                                        System.out.println("------------- ¿Que dato te gustaria actualizar del Coordinador?-----------");
                                        System.out.println("1). Nombres");
                                        System.out.println("2). Apellidos.");
                                        System.out.println("3). direccion.");
                                        System.out.println("4). Telefono Celular");
                                        System.out.println("5). Telefono Fijo");
                                        System.out.println("8). Salir.");
                                        System.out.println("------------------------------------------------------------");
                                        
                                        int opcion8 = scanner.nextInt();
                                        scanner.nextLine();
                                        
                                        switch(opcion8){
                                            case 1:
                                                System.out.println("Ingrese los nuevos nombres: ");
                                                String nuevoNombre = scanner.nextLine();
                                                coordinador1.nombres = nuevoNombre;
                                                System.out.println("Nombres actualizados correctamente");
                                                break;
                                            case 2:
                                                System.out.println("Ingrese los nuevos apellidos: ");
                                                String nuevoApellidos = scanner.nextLine();
                                                coordinador1.apellidos = nuevoApellidos;
                                                System.out.println("Apellidos actualizados correctamente");
                                                break;
                                            case 3:
                                                System.out.println("Ingrese la nueva direccion: ");
                                                String nuevaDireccion = scanner.nextLine();
                                                coordinador1.direccion = nuevaDireccion;
                                                System.out.println("Direccion actualizada correctamente");
                                                break;  
                                            case 4:
                                                System.out.println("Ingrese el nuevo telefono Celular: ");
                                                long nuevoTelefono = scanner.nextLong();
                                                coordinador1.telefonoCelular = nuevoTelefono;
                                                System.out.println("Telefono movil actualizado correctamente.");
                                                break;    
                                            case 5:
                                                System.out.println("Ingrese el nuevo telefono fijo: ");
                                                int nuevoTelefonoFijo = scanner.nextInt();
                                                coordinador1.telefonoFijo = nuevoTelefonoFijo;
                                                System.out.println("Telefono movil actualizado correctamente.");
                                                break; 
                                            case 8:
                                                salir8 = true;
                                                break;
                                        }
                                    }
                                    break;
                                case 11:
                                    System.out.println("Ingresa los datos del nuevo coordinador: ");
                                    
                                    System.out.println("Id:");
                                    int id2 = scanner.nextInt();
                                    scanner.nextLine();
                                    
                                    System.out.println("Numero de identificacion:");
                                    long numeroIdentificacion2 = scanner.nextLong();
                                    scanner.nextLine();
                                    
                                    System.out.println("Nombres:");
                                    String nombres2 = scanner.nextLine();
                                    
                                    System.out.println("Apellidos:");
                                    String apellidos2 = scanner.nextLine();
                                    
                                    System.out.println("Direccion:");
                                    String direccion2 = scanner.nextLine();
                                    
                                    System.out.println("Telefono celular:");
                                    long telefonoCelular2 = scanner.nextLong();
                                    scanner.nextLine();
                                    
                                    System.out.println("Telefono fijo:");
                                    int telefonoFijo2 = scanner.nextInt();
                                    scanner.nextLine();
                                    
                                    
                                    Coordinador nuevoCoordi = new Coordinador(id2,numeroIdentificacion2, nombres2, apellidos2, direccion2, telefonoCelular2, telefonoFijo2);
                                    
                                    coordinadorList.add(nuevoCoordi);
                                    System.out.println(coordinadorList);
                                   
                                    
                                    System.out.println("El Treiner fue registrado con exito.");
                                    break;
                                case 12:
                                    System.out.println("¿Que Trainer quieres eliminar? Ingresa sus nombres: ");
                                    scanner.nextLine();
                                    String elimina2 = scanner.nextLine();
                                    boolean delete2 = false;
                                    for (int i = 0; i < coordinadorList.size(); i++){
                                        if (coordinadorList.get(i).nombres.equalsIgnoreCase(elimina2)){
                                            coordinadorList.remove(i);
                                            delete2 = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    salir5 = true;
                                    break;
                            }
                        }
                    break;
                case 4:
                    finalizar = true;
                    System.out.println("Gracias por usar campuslands XD");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
                
        
       
    }
    
}
        
