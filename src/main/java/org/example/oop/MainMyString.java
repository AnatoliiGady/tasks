package org.example.oop;

public class MainMyString {
    public static void main(String[] args) {
        MyString myString = new MyString('П', 'р', 'и', 'в', 'е', 'т');
        MyString myString1 = new MyString('м', 'и', 'р');
        MyString s3 = myString.concat(myString1);
        myString.print();
        System.out.println();
        s3.print();
        System.out.println();

        System.out.println(myString.myEquals(myString1));

        MyString myStringRevers = new MyString('Д', 'о', 'в', 'о', 'д');
        MyString myStringRevers1 = new MyString('Д', 'о', 'в', 'о', 'д');
        System.out.println(myStringRevers.equals(myStringRevers1));

        MyString revers = myStringRevers.printRevers();
        revers.print();
    }
}
