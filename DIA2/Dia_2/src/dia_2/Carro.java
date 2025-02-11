/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_2;

/**
 *
 * @author Uniminuto Tibu
 */
public class Carro {
    // Atributos ("Caracteristicas")
    String marca;
    String modelo;
    int ano;
    String tipoCombustible;
    int caballosFuerza;
    int puertas;
    int asientos;
    int motor;
    String color;
    int cantLlanta;
    
    // Constructor 
    
    // La manera en como una clase se vaya a construir al momento de instanciarlo.
    
    public Carro(){}
    
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.caballosFuerza = 140;
        this.puertas = 5;
        this.asientos = 5;
        this.motor = 2800;
        this.color = "Negro";
        this.cantLlanta = 4;
    }

    public Carro(String marca, String modelo, int ano, String tipoCombustible, int caballosFuerza, int puertas, int asientos, int motor, String color, int cantLlanta) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustible = tipoCombustible;
        this.caballosFuerza = caballosFuerza;
        this.puertas = puertas;
        this.asientos = asientos;
        this.motor = motor;
        this.color = color;
        this.cantLlanta = cantLlanta;
    }

    
    

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tipoCombustible=" + tipoCombustible + ", caballosFuerza=" + caballosFuerza + ", puertas=" + puertas + ", asientos=" + asientos + ", motor=" + motor + ", color=" + color + ", cantLlanta=" + cantLlanta + '}';
    }
    
    
}
