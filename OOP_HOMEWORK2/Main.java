package OOP_HOMEWORK2;

public class Main {
    public static void name(String[] args) {
        
        Fish shark = new Shark("Шарки");
        Fish clownfish = new Clownfish("Нэмо");

        Aquarium aquarium = new Aquarium();
        aquarium.addFish(shark).addFish(clownfish);
        System.out.println(aquarium);

        SwimSpeed champ = aquarium.getSwimmerChampion();
        System.out.println("--champion--");
        System.out.println(champ);

        System.out.println("--swimmers--");
        for(SwimSpeed swimmer: aquarium.swimmers()){
            System.out.println(swimmer);
        }
    }
}
