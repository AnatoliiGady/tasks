package org.example.oop;

public class ClockMain {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 20);
        System.out.println(clock);
        Clock clock1 = clock.add(60);
        System.out.println(clock1);
    }
}
