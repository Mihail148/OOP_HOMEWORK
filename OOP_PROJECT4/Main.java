package OOP_PROJECT4;

import OOP_PROJECT4.Warriors.Archer;
import OOP_PROJECT4.Warriors.Infantryman;
import OOP_PROJECT4.Warriors.Warrior;
import OOP_PROJECT4.Weapons.Melee.Axe;
import OOP_PROJECT4.Weapons.Melee.Sword;
import OOP_PROJECT4.Weapons.Ranged.Bow;
import OOP_PROJECT4.Weapons.Ranged.Crossbow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John", 150, new Axe()));

        Team<Archer> teamArcher = new Team<>();
        teamArcher.add(new Archer("Jimmy", 100, new Crossbow()));
        teamArcher.add(new Archer("Peter", 100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("Andy", 150, new Sword()));
        
        System.out.println(team1);
        System.out.println("------------");
        System.out.println(teamArcher);
        System.out.println("------------");
        System.out.println(teamInfantryman);
    }
}
