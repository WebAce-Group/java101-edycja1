package w2.MiloszWS;

import java.util.Scanner;


public class Zadanie3 {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Prosze podac dluosc bokow trojkota: ");
        int bok1 = abc.nextInt();
        int bok2 = abc.nextInt();
        int bok3 = abc.nextInt();

        if (bok1 == bok2 && bok2 == bok3) {
            System.out.println("Trojkąt jest równoboczny.");
        }

        else if (bok1 == bok2 || bok1 == bok3 || bok2 == bok3) {
            System.out.println("Trojkąt jest równoramienny.");
        }

        else if (bok1 <= bok2 + bok3 && bok2 <= bok1 + bok3 && bok3 <= bok2 + bok1) {
            System.out.println("Trojkat jest roznoboczny, da sie zbudowac.");
        } else {
            System.out.println("Trojkata nie da sie zbudowac.");
        }
    }
}

