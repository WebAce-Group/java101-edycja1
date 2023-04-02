package w4.zadania.Nurek54;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość prostokąta: ");
        double length = scanner.nextDouble();

        System.out.print("Podaj szerokość prostokąta: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();

        System.out.println("Pole prostokąta: " + area);
        System.out.println("Obwód prostokąta: " + perimeter);
    }
}
