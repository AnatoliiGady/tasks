package org.example.animalsWithGui;

public class Main {
    public static void main(String[] args) {
        Fox fox = new Fox(new Coordinate(1,2), 3, 10, 10, 5);
        Hare hare = new Hare(new Coordinate(3,4), 3, 5, 10, 5);
        Berry berry = new Berry(new Coordinate(1,6), 5);
        Hunter hunter = new Hunter(new Coordinate(1, 2), 3, 10, 30);
        System.out.println(hunter.canKill(fox));
        hunter.kill(fox);
        hunter.kill(fox);
        hunter.kill(fox);
        hunter.kill(fox);
        hunter.kill(fox);
        System.out.println(hunter.getAmmo());
        System.out.println(hunter.canKill(berry));
    }
}
