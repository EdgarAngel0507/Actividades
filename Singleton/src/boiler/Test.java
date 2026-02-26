/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boiler;

/**
 *
 * @author edgar
 */

public class Test {

    public static void main(String[] args) {

        Boiler boiler = Boiler.getInstancia();

        boiler.mostrarEstado();

        boiler.llenar();
        boiler.mostrarEstado();

        boiler.iniciarMezcla();
        boiler.mostrarEstado();

        boiler.vaciar();
        boiler.mostrarEstado();
    }
}
