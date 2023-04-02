public class Rectangle {
    int length;
    int width;
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int getArea() {
        return length * width;
    }
    int getPerimeter() {
        return 2*length + 2*width;
    }
}