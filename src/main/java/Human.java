public class Human {
    private String name;
    private double height;
    private double weight;
    private int age;
    private String nationality;
    private boolean isSleep;

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
        System.out.println("Hi, my name is " + this.name + ", my age is " + this.age + ", and my nationality is " + this.nationality);
    }

    public void eat(String foodName) {
        System.out.println("I ate "+ foodName);
    }

    public void walk() {
        System.out.println(this.name + " погулял");
    }

    public void startSleep() {
        if (isSleep) {
            System.out.println(this.name + " start sleep");
            isSleep = true;
        } else {
            System.out.println(this.name + " can't do what else while sleeping");
        }
    }

    public void wakeUp() {
        if (!isSleep) {
            System.out.println(this.name + " wake up");
            isSleep = false;
        } else {
            System.out.println(this.name + " no sleep");
        }
    }


}
