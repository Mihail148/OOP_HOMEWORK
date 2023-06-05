package OOP_PROJECT4.Warriors;

import java.util.Random;

import OOP_PROJECT4.Weapons.Weapon;

public abstract class Warrior {
    private String name;

    private int healthPoint;

    private Weapon weapon;

    public Warrior (String name, int healthPoint, Weapon weapon){
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName(){
        return name;
    }

    public int getHealthPoint(){
        return healthPoint;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setHealthPoint(int healthPoint){
        this.healthPoint = healthPoint;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int hit(){
        Random rnd = new Random();
        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage){
        healthPoint -= damage;
        if(healthPoint < 0){
            healthPoint = 0;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d", name, weapon, healthPoint);
    }
}
