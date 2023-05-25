package OOP_PROJECT;

public class chocolate {
    private String chocColor;
    private String chocType;
    private int chocCalories;


    public chocolate (String productName, double productPrice, String chocColor, String chocType, int chocCalories){
        super(productName, productPrice);
        this.chocColor = chocColor;
        this.chocType = chocType;
        this chocCalories = chocCalories;
    }

    @Override
    public String toString(){
        return String.format("Шоколад: %s, Цвет: %s, Вкус: %s, Калории: %d")
    }
}
