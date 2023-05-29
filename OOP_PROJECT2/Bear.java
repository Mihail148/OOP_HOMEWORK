package OOP_PROJECT2;

public class Bear extends Predator implements RunSpeed, SwimSpeed {
    public Bear(String name){
        super(name);
    }

    @Override
    public String sound(){
        return "Rawr";
    }

    @Override
    public String toString(){
        return String.format("Bear: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }
    
    @Override
    public int getRunSpeed(){
        return 40;
    }

    @Override
    public int getSwimSpeed(){
        return 5;
    }
}
