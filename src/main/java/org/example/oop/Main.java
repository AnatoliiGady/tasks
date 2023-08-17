package org.example.oop;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mazda");
        car.setYear(2023);
        System.out.println(car.getModel() + " " + car.getYear());

    }

    public static void newCar(Car car) {
        car.getYear();
    }
}
