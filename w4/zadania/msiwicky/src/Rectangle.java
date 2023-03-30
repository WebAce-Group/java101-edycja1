class Rectangle {
    private int length;
    private int width;

    Rectangle(int _length, int _width) {
        length = _length;
        width = _width;
    }
    int getArea() {
        return length * width;
    }
    int getPerimeter() {
        return 2 * (length + width);
    }
}
