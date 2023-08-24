package org.example.oop;

public class ClockMain {
    public static void main(String[] args) {
        Clock clock = new Clock(2, 55);
        System.out.println(clock);
        Clock clock1 = clock.add(20);
        System.out.println(clock1);

        Clock clock2 = new Clock(1, 10);
        System.out.println(clock.add(clock2));
    }


}
