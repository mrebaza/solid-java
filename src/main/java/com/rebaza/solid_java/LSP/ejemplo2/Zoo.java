package com.rebaza.solid_java.LSP.ejemplo2;

// Un Zoologico que espera aves que vuelan.
public class Zoo {
    public void makeBirdFly(Bird bird) {
        System.out.println("\n --- Intentando hacer volar al pájaro ---");
        bird.fly();
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Bird sparrow  = new Bird();
        zoo.makeBirdFly(sparrow); // Funciona correctamente

        Penguin penguin = new Penguin();

        try {
            zoo.makeBirdFly(penguin); // Lanza excepción
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
