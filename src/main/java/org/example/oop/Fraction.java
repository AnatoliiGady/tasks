package org.example.oop;

public class Fraction {
    private int up;
    private int down;

    public Fraction(int up, int down) {
        this.up = up;
        this.down = down;
    }

    @Override
    public String toString() {
        return up
                + "/" + down
                ;
    }

    public Fraction add(Fraction added) {
        int downNum = this.down * added.down;
        int upNum = (this.up * added.down) + (added.up * this.down);
        int a = nod(upNum, downNum);
        downNum /= a;
        upNum /= a;
        Fraction fraction = new Fraction(upNum, downNum);
        return fraction;
    }

    public Fraction subtract(Fraction subtractNum) {
        int downNum = this.down * subtractNum.down;
        int upNum = (this.up * subtractNum.down) - (subtractNum.up * this.down);
        int nod = nod(upNum, downNum);
        downNum /= nod;
        upNum /= nod;
        Fraction fraction = new Fraction(upNum, downNum);
        return fraction;
    }

    public Fraction multiplication(Fraction multNum) {
        int downNum = this.down * multNum.down;
        int upNum = this.up * multNum.up;
        int nod = nod(upNum, downNum);
        downNum /= nod;
        upNum /= nod;
        Fraction fraction = new Fraction(upNum, downNum);
        return fraction;
    }

    public Fraction division(Fraction divNum) {

        int downNum = this.down * divNum.up;
        int upNum = this.up * divNum.down;
        int nod = nod(upNum, downNum);
        downNum /= nod;
        upNum /= nod;
        Fraction fraction = new Fraction(upNum, downNum);
        return fraction;
    }

    public int nod(int a, int b) {
        while (b != 0) {
            int digit = a % b;
            a = b;
            b = digit;
        }
        return a;
    }

    public void validate(Fraction val) {
        if (val.down == 0) {
            System.out.println("Делитель не может быть равен нулю!");
        }
    }
}
