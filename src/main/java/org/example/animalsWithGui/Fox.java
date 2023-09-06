package org.example.animalsWithGui;

public class Fox extends Animals {

    public Fox(Coordinate coordinate, int distance, int levelFood, int levelHealth, int foodLevelIncreasing) {
        super(coordinate, distance, levelFood, levelHealth, foodLevelIncreasing);
    }

    @Override
    public boolean canKill(Eatable eatable) {
        return eatable instanceof Hare ||
                eatable instanceof Mouse;
    }
}
