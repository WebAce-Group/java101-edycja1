import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 dlugosci bokow trojkata:");
        int side1, side2, side3;
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
        side3 = scanner.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.print("Trojkat jest ");
            if (side1 == side2 && side2 == side3)
                System.out.print("rownoboczny");
            else if (side1 == side2 || side1 == side3 || side2 == side3)
                System.out.print("rownoramienny");
            else
                System.out.print("roznoboczny");
        } else {
            System.out.println("Z danych bokow nie mozna zbudowac trojkata");
        }

    }
}
