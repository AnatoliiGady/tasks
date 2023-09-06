package org.example.animalsWithGui;

public abstract class Item {
    private Coordinate coordinate;
    private boolean isActive = true;

    public Item(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
