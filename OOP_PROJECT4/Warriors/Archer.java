package OOP_PROJECT4.Warriors;

import OOP_PROJECT4.Weapons.Ranged.Ranged;

public class Archer extends Warrior {
    public Archer(String name, int healthPoint, Ranged weapon){
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return ((Ranged)super.getWeapon().distance());
    }

    @Override
    public String toString(){
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}
