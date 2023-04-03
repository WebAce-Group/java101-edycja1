package w4.zadania.d9one;

import java.util.Scanner;

public class z14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc i szerokosc: ");
        Rectangle prostakat = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println(prostakat.getArea());
        System.out.println(prostakat.getPerimeter());

    }
}
