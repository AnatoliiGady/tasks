package org.example.animalsWithGui;

public abstract class Killer extends MovableItem {
    public Killer(Coordinate coordinate, int distance) {
        super(coordinate, distance);
    }

    public abstract void kill(Eatable eatable);
    public abstract boolean canKill(Eatable eatable);
}
