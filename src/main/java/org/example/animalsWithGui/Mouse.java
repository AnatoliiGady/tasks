package org.example.animalsWithGui;

public class Mouse extends Animals {

    public Mouse(Coordinate coordinate, int distance, int levelFood, int levelHealth, int foodLevelIncreasing) {
        super(coordinate, distance, levelFood, levelHealth, foodLevelIncreasing);
    }

    @Override
    public boolean canKill(Eatable eatable) {
        return eatable instanceof ForestFood;
    }
}
