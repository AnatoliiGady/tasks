package org.example.animalsWithGui;

public class ForestFood extends ImmovableItem implements Eatable {
    private int foodLevelIncreasing;

    public ForestFood(Coordinate coordinate, int foodLevelIncreasing) {
        super(coordinate);
        this.foodLevelIncreasing = foodLevelIncreasing;
    }

    @Override
    public int getFoodLevelIncreasing() {
        return foodLevelIncreasing;
    }

    @Override
    public void killThisEatable() {
        setActive(false);
    }
}
