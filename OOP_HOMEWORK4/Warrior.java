package OOP_HOMEWORK4;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Defendeable defend;


    public Warrior(String name, int healthPoint, Weaponable weapon, Defendeable defend){
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.defend = defend;
    }
    public String getName(){
        return name;
    }
    public int getHealthPoint(){
        return healthPoint;
    }
    public Weaponable getWeapon(){
        return weapon;
    }
    public Defendeable getDefend(){
        return defend;
    }
    public void setHealthPoint(int healthPoint){
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString(){
        return "Warrior [name = " + name + ", HealthPoint = " + healthPoint + ", Weapon = " + weapon + ", Defend = " + defend + "]";
    }
}
