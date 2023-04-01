import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc i szerokosc: ");
        Rectangle prostokacik = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println(prostokacik.getArea());
        System.out.println(prostokacik.getPerimeter());

    }
}
