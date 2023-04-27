package w2.zadania.Tomoo3;

import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner liczba1 = new Scanner(System.in);
        System.out.println("Podaj całkowitą długość pierwszego boku trójkąta: ");
        int bok1 = liczba1.nextInt();

        Scanner liczba2 = new Scanner(System.in);
        System.out.println("Podaj całkowitą długość drugiego boku trójkąta: ");
        int bok2 = liczba2.nextInt();

        Scanner liczba3 = new Scanner(System.in);
        System.out.println("Podaj całkowitą długość trzeciego boku trójkąta: ");
        int bok3 = liczba3.nextInt();

        if (bok1 + bok2 > bok3) {
            if (bok1 + bok3 > bok2) {
                if (bok3 + bok2 > bok1) {
                    System.out.println("Można zbudować trójkąt.");
                    if (bok1 == bok2 && bok1 == bok3) {
                        System.out.println("Jest to trójkąt równoboczny");
                    }
                    else if (bok1 == bok2 && bok1 != bok3) {
                        System.out.println("Jest to trójkąt równoramienny.");
                    }
                    else if (bok1 == bok3 && bok1 != bok2) {
                        System.out.println("Jest to trójkąt równoramienny.");
                    }
                    else if (bok2 == bok3 && bok2 != bok1) {
                        System.out.println("Jest to trójkąt równoramienny.");
                    }
                    else {
                        System.out.println("Jest to trójkąt różnoboczny.");
                    }
                }
                else {
                    System.out.println("Nie można zbudować trójkąta.");
                }
            }
            else {
                System.out.println("Nie można zbudować trójkąta.");
            }
        }
        else{
            System.out.println("Nie można zbudować trójkąta.");
        }
    }
}
