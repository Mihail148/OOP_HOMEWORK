package OOP_PROJECT4.Weapons.Melee;

public class Sword implements Melee{

    @Override
    public int damage() {
       return 4;
    }
    
    @Override
    public String toString(){
        return String.format("Sword: %s", damage());
    }
}
