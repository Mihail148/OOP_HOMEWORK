package OOP_PROJECT4.Warriors;

import OOP_PROJECT4.Weapons.Weapon;

public class Infantryman extends Warrior {

    public Infantryman(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }
    
    @Override
    public String toString(){
        return String.format("Infantryman: %s", super.toString());
    }
}
