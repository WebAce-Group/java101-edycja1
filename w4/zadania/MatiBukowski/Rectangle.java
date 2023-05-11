package w4.zadania.MatiBukowski;

class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length*width;
    }

    double getPerimetr() {
        return 2*length + 2*width;
    }
}