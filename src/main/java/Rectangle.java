public class Rectangle {
    String name;
    int height, width;

    public Rectangle(int h, int w, String n) {
        this.height = h;
        this.width = w;
        this.name = n;
    }

    public int area() {
        return this.height * this.width;
    }

}
