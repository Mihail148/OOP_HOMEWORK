package OOP_HOMEWORK2;

public class Shark extends Predator implements SwimSpeed {
    public Shark(String name){
        super(name);
    }

    @Override
    public String toString(){
        return String.format("Shark: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed(){
        return 60;
    }
}
