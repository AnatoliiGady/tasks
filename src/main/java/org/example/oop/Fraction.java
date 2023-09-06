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
        int downResult = this.down * added.down;
        int upResult = (this.up * added.down) + (added.up * this.down);
        int nod = nod(upResult, downResult);
        downResult /= nod;
        upResult /= nod;
        Fraction fraction = new Fraction(upResult, downResult);
        return fraction;
    }

    public Fraction subtract(Fraction subtractNum) {
        int downResult = this.down * subtractNum.down;
        int upResult = (this.up * subtractNum.down) - (subtractNum.up * this.down);
        int nod = nod(upResult, downResult);
        downResult /= nod;
        upResult /= nod;
        Fraction fraction = new Fraction(upResult, downResult);
        return fraction;
    }

    public Fraction multiplication(Fraction multNum) {
        int downResult = this.down * multNum.down;
        int upResult = this.up * multNum.up;
        int nod = nod(upResult, downResult);
        downResult /= nod;
        upResult /= nod;
        Fraction fraction = new Fraction(upResult, downResult);
        return fraction;
    }

    public Fraction division(Fraction divNum) {

        int downResult = this.down * divNum.up;
        int upResult = this.up * divNum.down;
        int nod = nod(upResult, downResult);
        downResult /= nod;
        upResult /= nod;
        Fraction fraction = new Fraction(upResult, downResult);
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
}
