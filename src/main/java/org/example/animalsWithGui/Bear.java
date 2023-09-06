package org.example.animalsWithGui;

public class Bear extends Animals {
    public Bear(Coordinate coordinate, int distance, int levelFood, int levelHealth, int foodLevelIncreasing) {
        super(coordinate, distance, levelFood, levelHealth, foodLevelIncreasing);
    }

    @Override
    public boolean canKill(Eatable eatable) {
        return eatable instanceof Fox ||
                eatable instanceof Hare ||
                eatable instanceof Mouse ||
                eatable instanceof ForestFood;
    }
}
