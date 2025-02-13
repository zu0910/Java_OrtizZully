
package proyecto_notas_vibrantes_ortizzully;

import java.util.ArrayList;
import java.util.Scanner;


public class Proyecto_Notas_Vibrantes_OrtizZully {
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Concierto concierto1 = new Concierto (1, "Tour 2025", "Emilia", "10-05-2025", "Movistar Arena", 400.000);
        Concierto concierto2 = new Concierto (2, "Dale Play", "Mijo J", "15-03-2025", "Movistar Arena", 250.000);
        
        ArrayList<Concierto> ListaConcierto = new ArrayList<>();
        
        ListaConcierto.add(concierto1);
        ListaConcierto.add(concierto2);
        
        boolean salir = false;
        while (salir == false){
            
            System.out.println("--------- BIENVENIDO A NOTAS VIBRANTES ---------");
            System.out.println("1). Ver conciertos disponibles.");
            System.out.println("2). Registrar clientes");
            System.out.println("3). Comprar ticket. ");
            System.out.println("4). Ver tickets por clientes.");
            System.out.println("5). Cancelar ticket.");
            System.out.println("6). Salir.");
            System.out.println("------------------------------------------------");
            
            int opc = scanner.nextInt();
            scanner.nextLine();
            
            switch (opc){
                case 1:
                    System.out.println("---------- CONCIERTOS DISPONIBLES --------------");
                    for (int i = 0; i< ListaConcierto.size(); i++){
                        System.out.println("-------------------------------------------------");
                        System.out.println("ID: " + ListaConcierto.get(i).id);
                        System.out.println("Nombre: " + ListaConcierto.get(i).nombre);
                        System.out.println("Artista: " + ListaConcierto.get(i).artista);
                        System.out.println("Fecha: " + ListaConcierto.get(i).fecha);
                        System.out.println("Lugar: " + ListaConcierto.get(i).lugar);
                        System.out.println("Precio base: " + ListaConcierto.get(i).PrecioBase);
                        System.out.println("-----------------------------------------------------");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    salir = true;
                    System.out.println("Gracias por utilizar notas vibrantes ");
                    break;
            }
        
            
        }
        
    }
    
}
