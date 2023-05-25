package OOP_PROJECT;

import java.util.ArrayList;
import java.util.List;

public class vendingmachine {
    private List<Product> vending = new ArrayList<>();

    public vendingmachine addProduct(Product prod){
        vending.add(prod);
        return this;
    }

    public List<Product> getVending(){
        return vending;
    }

    public Product findProduct(String name){
        
    }
}
