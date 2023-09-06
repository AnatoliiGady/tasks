package org.example.polimorfizm;

public class FlowerMeadowDemo {
    public static void main(String[] args) {
        Bee maja = new Bee(200);
        Bee willi = new Bee();
        BumbleBee brummsel = new BumbleBee();
        willi.poke();
        System.out.println("//------------//");
        maja.fly();
        System.out.println("//------------//");
        maja.poke();
        System.out.println("//------------//");
        brummsel.fly();
        System.out.println("//------------//");
        willi.pollenCollected = 10;
        willi.poke();


    }
}
