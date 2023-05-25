package OOP_PROJECT;

public class main {
    public static void main(String[] args) {
        vendingmachine apparat = new vendingmachine();
        apparat.addProduct(new Product("Alpen Gold", 10));
        apparat.addProduct(new Product("Яблок", 30));
        apparat.addProduct(new Product("Кола", 15));

        for(Product product: apparat.getVending()){
            System.out.println(product);
        }
    }
}
