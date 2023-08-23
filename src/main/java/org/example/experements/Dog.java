package org.example.experements;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Я сабака я умею ходить!");
        bark();
    }

    public void bark() {
        System.out.println("Я умею лаять");
    }
}
