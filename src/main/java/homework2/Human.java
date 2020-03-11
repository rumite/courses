package homework2;

public class Human {
    String name;
    double height;
    double weight;
    int age;
    String nationality;
    boolean isAwake;

    public Human() {

    }

    public Human(String name, double height, double weight, int age, String nationality) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.nationality = nationality;

    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + ", my age is " + age + ", and my nationality is " + nationality);
    }

    public void eat(String foodName) {
        System.out.println(name + " ate "+ foodName);
    }

    public void walk() {
        System.out.println(name + " погулял");
    }

    public void sleep() {
        if (isAwake) {
            System.out.println(name + " лег спать");
            isAwake = false;
        } else {
            System.out.println(name + " проснулся");
            isAwake = true;
        }
    }

    public double imt() {
        double imt = (double)weight / Math.pow((double)(height/100),2);
        return imt;
    }



}
