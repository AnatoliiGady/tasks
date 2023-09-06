package org.example.animalsWithGui;

public abstract class Animals extends Killer implements Eatable {
    private int levelFood;
    private int levelHealth;
    private int foodLevelIncreasing;

    public Animals(Coordinate coordinate, int distance, int levelFood, int levelHealth, int foodLevelIncreasing) {
        super(coordinate, distance);
        this.levelFood = levelFood;
        this.levelHealth = levelHealth;
        this.foodLevelIncreasing = foodLevelIncreasing;
    }

    @Override
    public void killThisEatable() {
        levelHealth = 0;
        setActive(false);
    }

    @Override
    public void kill(Eatable eatable) {
        if (canKill(eatable)) {
            levelFood += eatable.getFoodLevelIncreasing();
            levelHealth += eatable.getFoodLevelIncreasing();
            eatable.killThisEatable();
        }
    }

    @Override
    public int getFoodLevelIncreasing() {
        return foodLevelIncreasing;
    }

    public int getLevelFood() {
        return levelFood;
    }

    public void setLevelFood(int levelFood) {
        this.levelFood = levelFood;
    }

    public int getLevelHealth() {
        return levelHealth;
    }

    public void setLevelHealth(int levelHealth) {
        this.levelHealth = levelHealth;
    }
}
