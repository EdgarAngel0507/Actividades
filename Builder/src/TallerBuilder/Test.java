package TallerBuilder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edgar
 */

public class Test {

    public static void main(String[] args) {

        Hamburguesa hamburguesa1 = new Hamburguesa.Builder("Pan integral", "Carne de res")
                .conQueso(true)
                .conIngredientes("Lechuga y tomate")
                .build();

        Hamburguesa hamburguesa2 = new Hamburguesa.Builder("Pan brioche", "Pollo")
                .conQueso(false)
                .build();

        System.out.println(hamburguesa1);
        System.out.println("----------------------------");
        System.out.println(hamburguesa2);
    }
}
