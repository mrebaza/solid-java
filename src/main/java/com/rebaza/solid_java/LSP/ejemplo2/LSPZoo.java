package com.rebaza.solid_java.LSP.ejemplo2;

public class LSPZoo {
    public void feedBird(LSPBird bird){
        System.out.println("\n--- Alimentando al pájaro ---");
        bird.eat();
    }

    public void makeBirdFly(LSPFlyable birdFlyable){
        System.out.println("\n--- Intentando hacer volar al pájaro que puede volar ---");
        birdFlyable.fly();
    }

    public void main(String[] args){
        LSPZoo zoo = new LSPZoo();

        LSPSparrow sparrow = new LSPSparrow();
        zoo.feedBird(sparrow);
        zoo.makeBirdFly(sparrow);;

        LSPEagle eagle = new LSPEagle();
        zoo.feedBird(eagle);
        zoo.makeBirdFly(eagle);

        LSPPenguin penguin = new LSPPenguin();
        zoo.feedBird(penguin);
        // zoo.makeBirdFly(penguin); // Esto causaría un error de compilación, ¡que es lo que queremos!
        // System.out.println("No se puede hacer volar a un pingüino con makeBirdFly(Flyable).");

    }
}
