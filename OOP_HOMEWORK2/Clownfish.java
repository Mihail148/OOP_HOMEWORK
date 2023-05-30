package OOP_HOMEWORK2;

public class Clownfish extends Herbivores implements SwimSpeed {
    public Clownfish(String name){
        super(name);
    }

    @Override
    public String toString(){
        return String.format("Clownfish: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed(){
        return 10;
    }
}
