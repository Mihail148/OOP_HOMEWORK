package OOP_PROJECT4.Weapons.Ranged;

public class Crossbow implements Ranged {

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int distance() {
        return 100;
    }
    
    @Override
    public String toString(){
        return String.format("Crossbow: %s", damage());
    }
}
