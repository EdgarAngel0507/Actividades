/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boiler;

/**
 *
 * @author edgar
 */

public class Boiler {

    // Instancia única (Singleton)
    private static Boiler instancia;

    // Estados del boiler
    private boolean vacio;
    private boolean resistenciaEncendida;

    // Constructor privado
    private Boiler() {
        this.vacio = true;
        this.resistenciaEncendida = false;
        System.out.println("Boiler creado: Vacío y resistencia apagada.");
    }

    // Método para obtener la instancia única
    public static Boiler getInstancia() {
        if (instancia == null) {
            instancia = new Boiler();
        }
        return instancia;
    }

    // Método para llenar
    public void llenar() {
        if (vacio && !resistenciaEncendida) {
            vacio = false;
            System.out.println("Boiler lleno con mezcla de chocolate y leche.");
        } else {
            System.out.println("No se puede llenar el boiler.");
        }
    }

    // Método para iniciar mezcla
    public void iniciarMezcla() {
        if (!vacio && !resistenciaEncendida) {
            resistenciaEncendida = true;
            System.out.println("Mezcla iniciada. Resistencia encendida.");
        } else {
            System.out.println("No se puede iniciar la mezcla.");
        }
    }

    // Método para vaciar
    public void vaciar() {
        if (!vacio && resistenciaEncendida) {
            vacio = true;
            resistenciaEncendida = false;
            System.out.println("Boiler vaciado. Resistencia apagada.");
        } else {
            System.out.println("No se puede vaciar el boiler.");
        }
    }

    // Método para mostrar estado actual
    public void mostrarEstado() {
        System.out.println("Estado actual:");
        System.out.println("Vacío: " + vacio);
        System.out.println("Resistencia encendida: " + resistenciaEncendida);
        System.out.println("----------------------------");
    }
}
