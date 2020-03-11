package homework1;

public class Homework1Test {
    public static void main(String[] args) {
        Homework1 hw1 = new Homework1();
        hw1.method4();
        hw1.method5("Hi Mark", 5);

        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[3] = "Autumn";
        hw1.printArray(seasons);

        Rectangle rectangle = new Rectangle("Hey",5,3);
        rectangle.printArea();

        Brick brick = new Brick(1,2,6);
        brick.brickAreas();
        brick.brickVolume();

        Champion champion1 = new Champion("Bob",25,10,15);
        Champion champion2 = new Champion("Mary",10,10,15);
        Champion.matchChampions(champion1,champion2);

    }
}
