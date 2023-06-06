package OOP_HOMEWORK4.Weapons;

import OOP_HOMEWORK4.Weaponable;

public abstract class Weapon implements Weaponable {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage){
        this.pointOfDamage = pointOfDamage;
    }
}
