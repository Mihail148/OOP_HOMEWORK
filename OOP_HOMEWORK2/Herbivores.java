package OOP_HOMEWORK2;

public abstract class Herbivores extends Fish {
    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed(){
        return "bakteria";
    }
}
