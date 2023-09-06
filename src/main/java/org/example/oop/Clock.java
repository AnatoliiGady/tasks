package org.example.oop;

public class Clock {
    private final int hours;
    private final int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Clock add(int min) {
        return merge(this.hours, 0, this.minutes, min);
    }

    public Clock add(Clock c) {
        return merge(this.hours, c.hours, this.minutes, c.minutes);
    }

    private Clock merge(int h1, int h2, int m1, int m2) {
        int sumHours = h1 + h2;
        int sumMinutes = m1 + m2;
        int hoursResult = (sumHours + (sumMinutes / 60)) % 24;
        int minutesResult = sumMinutes % 60;
        return new Clock(hoursResult, minutesResult);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        String hours = this.hours < 10 ? "0" + this.hours : "" + this.hours;
        String minutes = this.minutes < 10 ? "0" + this.minutes : "" + this.minutes;
        return "Время: " + hours + ":" + minutes;
    }
}
