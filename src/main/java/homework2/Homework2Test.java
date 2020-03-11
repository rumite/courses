package homework2;


public class Homework2Test {
    public static void main(String[] args) {
        Human human1 = new Human("Timur", 180, 76, 26, "Tatar");
        human1.eat("Shavooha");
        human1.sleep();
        System.out.println(human1.imt());
    }

}
