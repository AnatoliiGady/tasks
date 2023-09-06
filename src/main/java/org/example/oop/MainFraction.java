package org.example.oop;

public class MainFraction {
    public static void main(String[] args) {
        Fraction add1 = new Fraction(1, 2);
        Fraction add2 = new Fraction(7, 12);
        System.out.println(add1.add(add2));

        Fraction subtract1 = new Fraction(7, 10);
        Fraction subtract2 = new Fraction(2, 5);
        System.out.println(subtract1.subtract(subtract2));

        Fraction mult1 = new Fraction(3, 6);
        Fraction mult2 = new Fraction(2, 5);
        System.out.println(mult1.multiplication(mult2));

        Fraction div1 = new Fraction(2, 0);
        Fraction div2 = new Fraction(3, 4);
        System.out.println(div1.division(div2));
    }

}
