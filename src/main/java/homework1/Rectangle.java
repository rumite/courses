package homework1;

public class Rectangle {
    String name;
    int height;
    int width;

    public Rectangle(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public void printArea() {
        int s = this.width * this.height;
        System.out.println("Площадь прямоугольника равна " + s);
    }
}
