package org.example.experements;

public abstract class Figure {

    public abstract double ploshad();

    @Override
    public String toString() {
        return "Площадь " + ploshad();
    }
}
