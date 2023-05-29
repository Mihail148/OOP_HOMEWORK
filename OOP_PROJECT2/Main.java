package OOP_PROJECT2;

public class Main {
    public static void main(String[] args){

        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow("Мурка");

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald"));
        System.out.println(zoo);

        System.out.println(zoo.getSound());

        RunSpeed champ = zoo.getRunnerChampion();
        System.out.println("--champion--");
        System.out.println(champ);
        System.out.println("--runners--");

        for(RunSpeed runner: zoo.runners()){
            System.out.println(runner);
        }

        System.out.println("--flyers--");
        for(FlySpeed flyer: zoo.flyers()){
            System.out.println(flyer);
        }

        System.out.println("--swimmers--");
        for(SwimSpeed swimmer: zoo.swimmers()){
            System.out.println(swimmer);
        }
    }
}
