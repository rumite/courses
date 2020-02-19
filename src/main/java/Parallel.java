public class Parallel {
    String name;
    int x, y, z;

    void volume() {
        int s;
        s = x * y * z;
        System.out.println(s);
    }

    void areas() {
        int a, b, c;
        a = x * y;
        b = y * z;
        c = x * z;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}