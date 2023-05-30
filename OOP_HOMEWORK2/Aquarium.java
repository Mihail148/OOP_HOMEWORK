package OOP_HOMEWORK2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private final List<Fish> aquarium = new ArrayList<>();

    public Aquarium addAnimal(Fish someFish){
        aquarium.add(someFish);
        return this;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("В аквариуме: %s");
        for(Fish fish: aquarium){
            builder.append(fish)
                    .append("\n");
        }
        return builder.toString();

    }

    public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for(SwimSpeed swimmer: swimmers){
            if(champ.getSwimSpeed() < swimmer.getSwimSpeed()){
                champ = swimmer;
            }
        }
        return champ;
    }

    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmers = new ArrayList<>();
        for(Fish fish: aquarium){
            if(fish instanceof SwimSpeed){
                swimmers.add((SwimSpeed)fish);
            }
        }
        return swimmers;
    }
}
