package OOP_HOMEWORK2;

public abstract class Fish {
    protected String name;

    public Fish(String name){
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString(){
        return String.format("Name: %s, Food: %s", name, feed());
    }
}
