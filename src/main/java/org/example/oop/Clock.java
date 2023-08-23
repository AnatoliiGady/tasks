package org.example.oop;

public class Clock {
    private final int hours;
    private final int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Clock add(int min) {
        int hoursNum = min / 60;
        int minutesNum = min - hoursNum * 60;
        int hoursResult = getHours() + hoursNum;
        int minResult = getMinutes() + minutesNum;

        if (minResult >= 60) {
            hoursResult += minResult / 60;
            minResult -= 60;
        }
        if (hoursResult >= 23) {
            hoursResult = hoursNum;
        }
        return new Clock(hoursResult, minResult);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return "Время: "
                + hours
                + ":" + minutes;
    }
}
