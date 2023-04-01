public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getArea() {
        return length * width;
    }
    int getPerimeter() {
        return 2 * length + 2 * width;
    }
}