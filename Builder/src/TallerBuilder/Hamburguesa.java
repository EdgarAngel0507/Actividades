/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerBuilder;

/**
 *
 * @author edgar
 */

public class Hamburguesa {

    // Atributos obligatorios
    private final String tipoPan;
    private final String tipoCarne;

    // Atributos opcionales
    private final boolean queso;
    private final String ingredientesAdicionales;

    // Constructor privado
    private Hamburguesa(Builder builder) {
        this.tipoPan = builder.tipoPan;
        this.tipoCarne = builder.tipoCarne;
        this.queso = builder.queso;
        this.ingredientesAdicionales = builder.ingredientesAdicionales;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public boolean tieneQueso() {
        return queso;
    }

    public String getIngredientesAdicionales() {
        return ingredientesAdicionales;
    }

    @Override
    public String toString() {
        return "Hamburguesa {" +
                "\n  Tipo de pan: " + tipoPan +
                "\n  Tipo de carne: " + tipoCarne +
                "\n  Queso: " + (queso ? "Sí" : "No") +
                "\n  Ingredientes adicionales: " +
                (ingredientesAdicionales != null ? ingredientesAdicionales : "Ninguno") +
                "\n}";
    }

    public static class Builder {

        // Obligatorios
        private final String tipoPan;
        private final String tipoCarne;

        // Opcionales
        private boolean queso;
        private String ingredientesAdicionales;

        public Builder(String tipoPan, String tipoCarne) {
            this.tipoPan = tipoPan;
            this.tipoCarne = tipoCarne;
        }

        public Builder conQueso(boolean queso) {
            this.queso = queso;
            return this;
        }

        public Builder conIngredientes(String ingredientesAdicionales) {
            this.ingredientesAdicionales = ingredientesAdicionales;
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
}
