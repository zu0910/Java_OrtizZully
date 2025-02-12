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
        // Crear usuario 
        
        User user1 = new User("Luis_01", "luorheber03");
        // Listas de estados, riesgos y notas
        List<String> estado = List.of("En proceso", "Inscrito","Aprobado","Cursando","Graduado","Expulsado","Retirado");
        List<String> riesgos = List.of("Bajo", "Alto", "Bajo","Alto", "Bajo");
        List<Double> notas = List.of(75.0, 43.0, 71.5, 49.5, 68.5);
        
        // Crear camper
        
        Campers camper1 = new Campers (5708, user1, 10939352265L , "Luis Jose","Bemon Henao","Diocesano","Franklin Henao",322890392,3452331,estado,
                "Cursando", "19-03-2024", "19-03-2025", "M1", "JavaScript",
                1, "", riesgos, notas);
        
        // Lista para almacenar campers
        List<Campers> campersList = new ArrayList<>();
        campersList.add(camper1);

        
        boolean salir = false;
        
        while (!salir){
            System.out.println("Bienvenido Camper");
            System.out.println("1). Reportes");
            System.out.println("2). Cambiar usuario y contraseña.");
            System.out.println("3). Cambiar información.");
            System.out.println("4). Salir");
            System.out.println("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion){
                case 1:
                    boolean salir1 = false;
                    while (!salir1) {
                        System.out.println("\n ---- REPORTES -----");
                        System.out.println("1). Mostrar datos del camper.");
                        System.out.println("2). Riesgo del camper.");
                        System.out.println("3). Ruta del camper.");
                        System.out.println("4). Trainer del camper.");
                        System.out.println("5). Modulo en el que se encuentra el camper.");
                        System.out.println("6). Salir.");
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
                    break;
                    
                case 3:
                    boolean salir2 = false;
                    while (!salir2){
                        System.out.println("\n ---- CAMBIAR INFORMACION -----");
                        System.out.println("1). Cambiar dirección.");
                        System.out.println("2). Cambiar telefono movil.");
                        System.out.println("3). Cambiar telefono fijo.");
                        System.out.println("4). Salir.");
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
                    
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    
            }
            
            scanner.close();
        }
        
        
        
    }
    
}
        
