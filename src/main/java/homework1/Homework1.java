package homework1;

public class Homework1 {

    public static void main(String[] args) {
        method3(2,3);
        System.out.println(capacity(255));

    }

    static void method1() {
        System.out.println("Hello, world!");
    }

    static int method2(int a) {
        return a = a * 2;
    }

    static void method3(int a, int b) {
        System.out.println(a * b);
    }

    void method4() {
        System.out.println("Method4 works!");
    }

    void method5(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    boolean method6(int a) {
        if (a > 0) {
            return true;
        } else return false;
    }

    void printArray(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    static boolean isParity(int a) {
        if (a%2 == 0) {
            return true;
        }
        return false;
    }

    static boolean canDivide3(int a) {
        if (a%3 == 0) {
            return true;
        }
        return false;
    }

    static boolean canDivide5(int a) {
        if (a%5 == 0) {
            return true;
        }
        return false;
    }

    static int capacity(int a) {
        int s = 0;
        if (a == 0) {
            return s + 1;
        } else while (a >= 1) {
            a = a / 10;
            s++;
        }
        return s;
        }
    }