package org.example.oop;

public class Dog {
    private String name;
    private int age;
    private String dogBreed;

    public Dog() {
    }

    public Dog(String name, int age, String dogBreed) {
        this.name = name;
        this.age = age;
        this.dogBreed = dogBreed;
    }

    public void bark() {
        System.out.println("Гав - гав!");
    }

    public void dogInformation() {
        System.out.println("Я пес по кличке " + name + " моя порода " + dogBreed + " и мне " + age + " года");
    }

    public static void main(String[] args) {
        Dog sharik = new Dog();
        sharik.name = "Шарик";
        sharik.age = 3;
        sharik.dogBreed = "Спаниэль";
        sharik.dogInformation();
        sharik.bark();

        Dog murzik = new Dog("Мурзик", 3, "Пудель");
        murzik.dogInformation();
        murzik.bark();

        Dog noName = new Dog();
        noName.dogInformation();
        noName.bark();

    }

}
