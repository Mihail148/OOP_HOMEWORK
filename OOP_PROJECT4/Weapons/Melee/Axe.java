package OOP_PROJECT4.Weapons.Melee;

public class Axe implements Melee {

    @Override
    public int damage() {
        return 5;
    }
    
    @Override
    public String toString(){
        return String.format("Axe: %s", damage());
    }
}
