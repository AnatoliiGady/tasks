package org.example.oop;


public class MyString {
    private final char[] chars;

    public MyString(char... chars) {
        this.chars = chars;
    }

    public void print() {
        System.out.print(chars);
    }

    public int getLength() {
        return chars.length;
    }

    public MyString concat(MyString otherString) {
        char[] s1 = this.chars;
        char[] s2 = otherString.chars;
        char[] s3 = new char[s1.length + s2.length];
        for (int i = 0; i < s1.length; i++) {
            s3[i] = s1[i];
        }
        for (int i = 0; i < s2.length; i++) {
            s3[s1.length + i] = s2[i];
        }
        MyString result = new MyString(s3);
        return result;
    }

    public boolean equalsMyString(MyString otherString) {
        char[] s1 = this.chars;
        char[] s2 = otherString.chars;
        if (s1.length != s2.length) {
            return false;
        }
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    public MyString printReversMyString() {
        char[] s1 = this.chars;
        char[] s2 = new char[s1.length];
        int count = 0;
        for (int i = s1.length - 1; i >= 0; i--) {
            s2[count] = s1[i];
            count++;
        }
        MyString result = new MyString(s2);
        return result;
    }
}
