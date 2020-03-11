package homework1;

public class Champion {
    String name;
    int strength, agility, intelligence;

    public Champion(String name, int strength, int agility, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public static void matchChampions(Champion champ1, Champion champ2) {
        if (champ1.agility * champ1.intelligence * champ1.strength == champ2.agility * champ2.intelligence * champ2.strength) {
            System.out.println("Ничья");
        } else if (champ1.agility * champ1.intelligence * champ1.strength > champ2.agility * champ2.intelligence * champ2.strength) {
            System.out.println("Первый круче");
        } else {
            System.out.println("Второй круче");
        }
    }
}
