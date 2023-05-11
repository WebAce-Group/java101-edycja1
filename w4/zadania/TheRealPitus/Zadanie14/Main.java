package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a: ");
        float a = scanner.nextInt();
        System.out.println("Podaj bok b: ");
        float b = scanner.nextInt();
        Rectangle rectangle = new Rectangle(a,b);
        System.out.println(rectangle.getArea()+" "+ rectangle.getPerimeter());
    }

}