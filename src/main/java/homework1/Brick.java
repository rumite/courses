package homework1;

public class Brick {
    int a, b, c;

    public Brick(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void brickAreas() {
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println(a * b);
        System.out.println(a * c);
        System.out.println(b * c);
    }

    public void brickVolume() {
        System.out.println(a * b * c);
    }
}
