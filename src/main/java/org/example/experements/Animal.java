package org.example.experements;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{"
                + "name='" + name + '\''
                + '}';
    }

    public void go() {
        System.out.println("Я умею ходить");
    }
}
