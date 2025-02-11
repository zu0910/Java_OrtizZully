
package tiendita_ortizzully;

import java.util.ArrayList;
import java.util.Scanner;

public class Tiendita_OrtizZully {

    
    public static void main(String[] args) {
        
        // Habilita la funcion de entrada para el usuario
        Scanner teclado = new Scanner(System.in);
        
        // Lista de los cosmeticos de la tienda
        ArrayList<String> cosmeticos = new ArrayList<String>();

        // Añadir cosmetico a la lista
        
        cosmeticos.add("Base.");
        cosmeticos.add("Labial.");
        
        int opcion;
        
        while (true) {
            System.out.println("\n BIENVENIDO A MAKEUP STORE");
            System.out.println("Por favor ingresa una de las siguiente opciones: ");
            System.out.println("1. Ver cosmeticos disponibles.");
            System.out.println("2. Añadir un cosmetico. ");
            System.out.println("3. Eliminar un cosmetico.");
            System.out.println("4. Actualizar un cosmetico. ");
            System.out.println("5. Salir de la tienda. ");
            System.out.println("Opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion){
                case 1:
                    // Mostrar la lista de cosmeticos
                    
                    System.out.println("\n Cosmeticos disponibles: ");
                    
                    for (int i = 0; i<cosmeticos.size(); i++){
                        System.out.println(i + ":" + cosmeticos.get(i));
                    }
                    break;
                    
                case 2:
                    // Añadir un cosmetico
                    
                    System.out.println("\nIngrese el nombre del nuevo cosmetico: ");
                    String nuevoCosmetico = teclado.nextLine();
                    cosmeticos.add(nuevoCosmetico);
                    System.out.println("Cosmetico añadido con exito.");
                    break;
                    
                case 3:
                    
                    //Eliminar cosmetico
                    System.out.println("\n Ingrese el nombre del producto que deseas eliminar: ");
                    String EliminarCosme = teclado.nextLine();
                    if (cosmeticos.remove(EliminarCosme)) {
                        System.out.println("Cosmetico eliminado con exito.");
                    } else {
                        System.out.println("Lo siento el cosmetico no existe.");
                    }
                  
                    break;
                    
                case 4:
                    int indice = 0;
                    // Actualizar cosmetico 
                    System.out.println("\n Ingrese el indice del cosmetico a actualizar: ");
                    int Indice = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el nuevo nombre del cosmetico: ");
                    String ActualizarNombre = teclado.nextLine();
                    cosmeticos.set(indice, ActualizarNombre);
                    System.out.println("El cosmetico ha sido actualizado con exito.");
       
                    break;

                    
                case 5:
                    
                    // Salir de la tienda
                    
                    System.out.println("Gracias por venia  a MAKEUP STORE ¡Vuelve pronto!");
                    teclado.close();
                    return; // Finaliza la ejecucion del programa 
                    
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
            }
                
        }
 
    }
}
