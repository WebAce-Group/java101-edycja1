import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszy bok trójkąta: ");
        int bok1 = scanner.nextInt();
        System.out.print("Podaj drugi bok trójkąta: ");
        int bok2 = scanner.nextInt();
        System.out.print("Podaj trzeci bok trójkąta: ");
        int bok3 = scanner.nextInt();
        if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok3 + bok2 > bok1) {
            if (bok1 == bok2 && bok2 == bok3)
                System.out.println("Trójkąt równoboczny");
            else if (bok1 == bok2 || bok2 == bok3 || bok1 == bok3)
                System.out.println("Trójkąt równoramienny");
            else
                System.out.println("Trójkąt różnoboczny");
        }
        else
            System.out.println("Nie da sie zbudować trójkąta z danych boków!");
    }
}