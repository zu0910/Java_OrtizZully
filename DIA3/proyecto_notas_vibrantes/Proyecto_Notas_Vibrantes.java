
package proyecto_notas_vibrantes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author const
 */
public class Proyecto_Notas_Vibrantes {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Concierto concierto1 = new Concierto (1, "Tour 2025", "Emilia", "10-05-2025", "Movistar Arena", 400.000);
        Concierto concierto2 = new Concierto (2, "Dale Play", "Mijo J", "15-03-2025", "Movistar Arena", 250.000);
        Concierto concierto3 = new Concierto (3, "World Tour", "Shakira", "20-02-2025", "Estadio metropolitano", 840.000);
        
        ArrayList<Concierto> ListaConcierto = new ArrayList<>();
        
        ListaConcierto.add(concierto1);
        ListaConcierto.add(concierto2);
        ListaConcierto.add(concierto3);
        
        ArrayList<Cliente> ListaClientes = new ArrayList<>();
        
        Zona zona1 = new Zona (1, "VIP", 15, 400.000);
        Zona zona2 = new Zona (2, "General", 25, 200.000);
        Zona zona3 = new Zona (3, "Platea", 30, 100.000);
        
        ArrayList<Zona> ListaZona = new ArrayList<>();
        
        ListaZona.add(zona1);
        ListaZona.add(zona2);
        ListaZona.add(zona3);
        
        ArrayList<Ticket> ListaTicket = new ArrayList<>();
        
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
                    System.out.println("------------ CONCIERTOS DISPONIBLES -----------------");
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
                    boolean otro = true;
                    while (otro == true){
                        System.out.println("---------- REGISTRO DE CLIENTES ----------");
                    
                        System.out.println("Ingrese su id: ");
                        int idCliente = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese su nombre: ");
                        String nombreCliente = scanner.nextLine();

                        System.out.println("Ingrese su apellido: ");
                        String apellidoCliente = scanner.nextLine();

                        System.out.println("Ingrese su correo: ");
                        String correoCliente = scanner.nextLine();

                        System.out.println("Ingrese su telefono: ");
                        long telefonoCliente = scanner.nextLong();
                        scanner.nextLine();

                        ListaClientes.add (new Cliente (idCliente, nombreCliente, apellidoCliente, correoCliente, telefonoCliente) );
                        System.out.println("El cliente fue registrado con exito.");
                        
                        System.out.println("Deseas registrar otro cliente (SI/NO)");
                        String respuesta = scanner.nextLine();
                        otro = respuesta.equalsIgnoreCase("SI");
                        System.out.println("--------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("-------------- COMPRA TU TICKET AQUI --------------");
                    System.out.println("------------ CLIENTES REGISTRADOS ---------------");
                    for (int i = 0; i <ListaClientes.size(); i++){
                        System.out.println("-------------------------------------------------");
                        System.out.println("ID: " + ListaClientes.get(i).id);
                        System.out.println("Nombre: " + ListaClientes.get(i).nombre);
                        System.out.println("Apellido: " + ListaClientes.get(i).apellido);
                        System.out.println("Correo: " + ListaClientes.get(i).correo);
                        System.out.println("Lugar: " + ListaClientes.get(i).telefono);
                        System.out.println("-----------------------------------------------------");
                    }
                    System.out.println("Por favor ingrese el ID del cliente: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine();
                    
                    
                    System.out.println("------------ CONCIERTOS DISPONIBLES -----------------");
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
                    
                    System.out.println("Ingrese el concierto que desear asistir: ");
                    int idConcierto = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("---------- ZONAS DISPONIBLE ------------ ");
                    for (int i = 0; i< ListaZona.size(); i++){
                        System.out.println("-------------------------------------------------");
                        System.out.println("ID: " + ListaZona.get(i).id);
                        System.out.println("Nombre de la zona: " + ListaZona.get(i).nombreZona);
                        System.out.println("Capacidad: " + ListaZona.get(i).capacidad);
                        System.out.println("Precio adicional: " + ListaZona.get(i).precioAdicional);
                        System.out.println("-----------------------------------------------------");
                    }
                    System.out.println("Ingrese la zona que deseas estar: ");
                    int idZona = scanner.nextInt();
                    scanner.nextLine();
                    
                    Zona zonaSeleccionada = null;
                    for (Zona z : ListaZona) {
                        if (z.id == idZona){
                            zonaSeleccionada = z;
                            break;
                        }
                    }
                    
                    if (zonaSeleccionada == null){
                        System.out.println("Lo siento esa zona no esta disponible");
                        break;
                    }
                    
                    // Obtener el precio del concierto
                    double PrecioBase = 0;
                    for (Concierto c : ListaConcierto){
                        if (c.id == idConcierto){
                            PrecioBase = c.PrecioBase;
                            break;
                        }
                    }
                    
                    double PrecioFinal = PrecioBase + zonaSeleccionada.precioAdicional;
                         
                    
                    Ticket nuevoTicket = new Ticket (Ticket.contTicket + 1, idCliente, idConcierto, zonaSeleccionada.nombreZona, PrecioFinal);
                    ListaTicket.add(nuevoTicket);
                    
                    System.out.println("Tu compra ha sido un exito");
                    System.out.println("Tu ticket es: "+ nuevoTicket);
                    
                    
                    break;
                case 4:
                    System.out.println("Por favor ingrese el ID del cliente para ver su ticket: ");
                    int idClien = scanner.nextInt();
                    scanner.nextLine();
                    
                    for (Ticket t : ListaTicket){
                        if(t.id_cliente == idClien){
                            System.out.println("---------------------------------");
                            System.out.println("ID: " + t.id);
                            System.out.println("ID concierto: " + t.id);
                            System.out.println("Zona: " + t.zona);
                            System.out.println("Precio Final: " + t.precioFinal);
                            System.out.println("Fecha de compra: " + t.fechaCompra);
                        }else {
                            System.out.println("Lo siento no tienes ningun ticket registrado :( ");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingresa el ID del ticket a eliminar: ");
                    int idTicketElimi = scanner.nextInt();
                    scanner.nextLine();
                    
                    for (int i = 0; i <ListaTicket.size(); i++){
                        if (ListaTicket.get(i).id == idTicketElimi){
                            ListaTicket.remove(idTicketElimi);
                            break;
                        }
                    }
                    System.out.println("El ticket ha sido eliminado con exito.");
                    break;
                case 6:
                    salir = true;
                    System.out.println("Gracias por utilizar notas vibrantes ");
                    break;
            }
        
            
        }
    }
    
}
