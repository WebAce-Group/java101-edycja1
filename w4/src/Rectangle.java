package w4.zadania.Ksromek;
public class Rectangle {
    private int lenght;
    private int width;
    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = 4;
    }

    public int getArea() {
        return lenght*width;
    }

    public int getPerimeter() {
        return 2*lenght+2*width;
    }

}
