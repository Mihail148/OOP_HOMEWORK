package OOP_HOMEWORK4;

import OOP_HOMEWORK4.Shield.SmallShield;
import OOP_HOMEWORK4.Weapons.Sword;

public class Swordmen extends Warrior {
    public Swordmen (String name, int healthPoint, Sword sword, SmallShield smallShield){
        super(name, healthPoint, sword, smallShield);
    }

    @Override
    public String toString(){
        return "Swordmen" + super.toString();
    }

    public int shotArmor(){
        return ((SmallShield)getDefend()).getArmor();
    }
}
