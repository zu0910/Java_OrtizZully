/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campuslands_erp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author const
 */
public class Campuslands_ERP {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Listas de estados, riesgos y notas
        List<String> estado = List.of("En proceso", "Inscrito","Aprobado","Cursando","Graduado","Expulsado","Retirado");
        List<String> riesgos = List.of("Bajo", "Alto", "Bajo","Alto", "Bajo");
        List<Double> notas = List.of(75.0, 43.0, 71.5, 49.5, 68.5);
        
        
        // Crear un camper
        
        Campers camper1 = new Campers (5708,  10939352265L , "Luis Jose","Bemon Henao","Diocesano","Franklin Henao",322890392,3452331,estado,
                "Cursando", "19-03-2024", "19-03-2025", "M1", "JavaScript",
                1, "", riesgos, notas);
        
        // Crear un trainer
        
        Trainers trainer1 = new Trainers (1234, 10923445837L,"Pedro jose", "Perez Sanchez", "Bogota", 326659882L, 234567,"Java", "T1");
        
        // Crear un Coordinador 
        
        Coordinador coordinador1 = new Coordinador (1254, 912837128745L,"Brayan Stiven", "Carvajal Romero", "Bucaramanga", 3278293845L,  1230989);
        

        // Lista para almacenar campers
        
        List<Campers> campersList = new ArrayList<>();
        campersList.add(camper1); // Agregar a la lista el camper creado 
        
        // Lista para almacenar Trainer
        
        List<Trainers> trainersList = new ArrayList<>();
        trainersList.add(trainer1); // Agregar a la lista el trainer creado 
        
        // Lisra para almacenar 

        List<Coordinador> coordinadorList = new ArrayList<>();
        coordinadorList.add(coordinador1); // Agregar a la lista el coordinador creado 
        
        boolean finalizar = false;
        
        while (!finalizar){
            System.out.println("-------- BIENVENIDOS A CAMPUSLANDS ----------");
            System.out.println("1). Camper.");
            System.out.println("2). Trainer.");
            System.out.println("3). Coordinador.");
            System.out.println("4). Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese su opción: ");
            int opc = scanner.nextInt();
            scanner.nextLine();
            
            switch (opc) {
                case 1:
                    boolean salir = false;
        
                    while (!salir){
                        System.out.println("---- BIENVENIDO CAMPER--------");
                        System.out.println("1). Reportes");
                        System.out.println("2). Cambiar información.");
                        System.out.println("3). Salir");
                        System.out.println("------------------------------");
                        System.out.println("Ingrese su opción: ");
                        
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
                                    System.out.println("Ingrese su opción: ");
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
                                    System.out.println("1). Cambiar dirección.");
                                    System.out.println("2). Cambiar telefono movil.");
                                    System.out.println("3). Cambiar telefono fijo.");
                                    System.out.println("4). Salir.");
                                    System.out.println("-------------------------------------");
                                    System.out.println("Ingrese su opción: ");
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
                        System.out.println("2). Cambiar información.");
                        System.out.println("3). Ruta de entrenamiento.");
                        System.out.println("4). Grupo asignacion. ");
                        System.out.println("5). Salir");
                        System.out.println("------------------------------");
                        System.out.println("Ingrese su opción: ");
                        
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
                                    System.out.println("1). Cambiar dirección.");
                                    System.out.println("2). Cambiar telefono movil.");
                                    System.out.println("3). Cambiar telefono fijo.");
                                    System.out.println("4). Salir.");
                                    System.out.println("-------------------------------------");
                                    System.out.println("Ingrese su opción: ");
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
                        System.out.println("1). Ver camper.");
                        System.out.println("2). Actualizar camper.");
                        System.out.println("3). Agregar un camper.");
                        System.out.println("4). Eliminar un camper. ");
                        System.out.println("5). Ver camper.");
                        System.out.println("6). Actualizar camper.");
                        System.out.println("7). Agregar un camper.");
                        System.out.println("8). Eliminar un camper. ");
                        System.out.println("9). Ver camper.");
                        System.out.println("10). Actualizar camper.");
                        System.out.println("11). Agregar un camper.");
                        System.out.println("12). Eliminar un camper. ");
                        System.out.println("13). Salir");
                        System.out.println("------------------------------");
                        System.out.println("Ingrese su opción: ");
                        
                        int opcion5 = scanner.nextInt();
                        
                        boolean salir5 = false;
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
        
