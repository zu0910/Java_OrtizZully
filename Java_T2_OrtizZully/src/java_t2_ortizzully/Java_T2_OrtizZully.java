
package java_t2_ortizzully;



import java.util.ArrayList;
import java.util.Scanner;
public class Java_T2_OrtizZully {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creacion de datos primitivos
        
        String texto = "Tibu";
        int num1 = 3;
        int num2 = 1;
        float num4 = (float) 3.3;
        double num3 = 3.14;
        Boolean booleanito = true;
        System.out.println(num1 + num2 + num3+num4+texto+booleanito);
        
        // Habilitar las funciones de entreda por el usuario 
        Scanner zully = new Scanner(System.in);
        String textoNuevo = "";
        
        System.out.println("Por favor ingresa tu nombre: ");
        textoNuevo = zully.nextLine();
        System.out.println("Tu nombre es: "+textoNuevo);
        System.out.println("Que numerito te gusta?: ");
        float numeritoFloat = zully.nextFloat();
        System.out.println("Tu numerico es: " + numeritoFloat);
        zully.close();
        
        // Ciclo for 
        
        for (int i= 0; i<5 ; i++) {
            System.out.println(i);
        }
        
        // Ciclo While
        
        while(booleanito == true) {
            System.out.println("Soy alguien verdadero !!!");
            break;
        }
        
        // Lista en Java
        
        ArrayList<String> listaNombres = new ArrayList<String>();
        
        // Añadir elementos a la lista 
        
        listaNombres.add("Zully");
        listaNombres.add("Aleja");
        listaNombres.add("Yessica");
        listaNombres.add("Henao");
        
        // Si quiero insertar un dato en alguna posicion utilizo el siguiente comando;
        
        listaNombres.add(0, "Camilo");
        System.out.println(listaNombres);
        
        // Obtener un elemento de la lista de acuerdo a su indice
        System.out.println(listaNombres.get(2));
        
        // Cambiar un elemento de la lista de acuerdo a su indice 
        
        listaNombres.set(4, "Dieguito");
        System.out.println(listaNombres);
        
        for (int i=0; i<listaNombres.size(); i++) {
            System.out.println(listaNombres.get(i));
        }
        
        // Eliminar un elemento de la lista
        listaNombres.remove(3);
        System.out.println(listaNombres);
    }
}