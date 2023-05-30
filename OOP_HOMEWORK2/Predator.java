package OOP_HOMEWORK2;

public abstract class Predator extends Fish {
    public Predator(String name){
        super(name);
}
@Override
public String feed(){
    return "meat";
}
}