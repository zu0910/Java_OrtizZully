/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_notas_vibrantes;

import java.time.LocalDate;

/**
 *
 * @author const
 */
public class Ticket {
    static int contTicket = 0;
    int id;
    int id_cliente;
    int id_concierto;
    String zona;
    double precioFinal;
    LocalDate fechaCompra;

    public Ticket(int id, int id_cliente, int id_concierto, String zona, double precioFinal) {
        contTicket = contTicket +1;
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_concierto = id_concierto;
        this.zona = zona;
        this.precioFinal = precioFinal;
        this.fechaCompra = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_concierto=" + id_concierto + ", zona=" + zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
}
