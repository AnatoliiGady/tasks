package org.example.experements;

public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double ploshad() {
        return a * a;
    }
}
