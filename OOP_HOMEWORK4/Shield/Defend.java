package OOP_HOMEWORK4.Shield;

import OOP_HOMEWORK4.Defendeable;

public abstract class Defend implements Defendeable {
    protected int pointOfDefend;

    public Defend(int pointOfDefend){
        this.pointOfDefend = pointOfDefend;
    }
}
