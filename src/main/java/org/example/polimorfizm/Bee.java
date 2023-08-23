package org.example.polimorfizm;

public class Bee extends FlyingInsect {
    int pollenCollected;

    public Bee(int pollenCollected) {
        System.out.println("эй эй, столько красивой пыльцы!");
        this.pollenCollected = pollenCollected;
    }

    public Bee() {
        this.pollenCollected = 0;
    }

    public void fly() {
        System.out.println("гул гул");
    }

    public void poke() {
        if (pollenCollected > 100) {
            System.out.println("я собрал целых :-) " + pollenCollected + " штучек пыльцы! :-)");
        } else {
            System.out.println("я собрал всего :-( " + pollenCollected + " штучек пыльцы! :-(");
        }
    }
}
