package org.example.animalsWithGui;

public class Hare extends Animals {

    public Hare(Coordinate coordinate, int distance, int levelFood, int levelHealth, int foodLevelIncreasing) {
        super(coordinate, distance, levelFood, levelHealth, foodLevelIncreasing);
    }

    @Override
    public boolean canKill(Eatable eatable) {
        return eatable instanceof Mouse ||
                eatable instanceof ForestFood;
    }
}
