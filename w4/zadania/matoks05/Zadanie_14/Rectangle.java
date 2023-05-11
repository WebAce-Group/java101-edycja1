package Zadanie_14;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return (length * width);
    }

    public double getPerimeter() {
        return 2*length + 2*width;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Rectangle zadanie14 = new Rectangle(scan.nextDouble(), scan.nextDouble());
        System.out.println(zadanie14.getArea());
        System.out.println(zadanie14.getPerimeter());
    }
}

