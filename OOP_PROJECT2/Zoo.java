package OOP_PROJECT2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final Radio radio = new Radio();
    private final List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal someAnimal){
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("В зоопарке: %s");
        for(Animal animal: zoo){
            builder.append(animal)
                    .append("\n");
        }
        return builder.toString();

    }

    private List<Soundable> getSoundable(){
        List<Soundable> result = new ArrayList<>(zoo);
        result.add(radio);
        return result;
    }

    public String getSound(){
        StringBuilder builder = new StringBuilder();
        for(Soundable soundable: getSoundable()){
            builder.append(soundable.sound()).append("\n");
        }
        return builder.toString();
    }

    List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for(Animal animal: zoo){
            if (animal instanceof RunSpeed){
                runners.add((RunSpeed)animal);
            }
        }
        return runners;
    }

    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for(RunSpeed runner: runners){
            if(champ.getRunSpeed() < runner.getRunSpeed()){
                champ = runner;
            }
        }
        return champ;
    }

    public List<FlySpeed> flyers(){
        List<FlySpeed> flyers = new ArrayList<>();
        for(Animal animal: zoo){
            if(animal instanceof FlySpeed){
                flyers.add((FlySpeed)animal);
            }
        }
        return flyers;
    }

    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmers = new ArrayList<>();
        for(Animal animal: zoo){
            if(animal instanceof SwimSpeed){
                swimmers.add((SwimSpeed)animal);
            }
        }
        return swimmers;
    }

}
