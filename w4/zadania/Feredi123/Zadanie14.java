package zadania.Feredi123;

public class Zadanie14 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2,2);
        Rectangle r2 = new Rectangle(5,10);
        Rectangle r3 = new Rectangle(4,6);

        System.out.println("Pole r1 wynosi: " + r1.getArea());
        System.out.println("Obwód r1 wynosi: " + r1.getPerimeter());
    }

}
class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }
}


