package org.example.animalsWithGui;

public class Hunter extends Killer {
    private int ammo;
    private int shootRange;

    public Hunter(Coordinate coordinate, int distance, int shootRange, int ammo) {
        super(coordinate, distance);
        this.ammo = ammo;
        this.shootRange = shootRange;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getShootRange() {
        return shootRange;
    }

    @Override
    public void kill(Eatable eatable) {
        if (canKill(eatable)) {
            eatable.killThisEatable();
            ammo--;
        }
    }

    @Override
    public boolean canKill(Eatable eatable) {
        return eatable instanceof Animals;
    }
}
