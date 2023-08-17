package org.example.abstracts;

public class Sedan extends Car {

    public void gas() {
        System.out.println("Газуем");
    }

    @Override
    public void brake() {
        System.out.println("Седан тормозин!");
    }

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.gas();
    }
}
