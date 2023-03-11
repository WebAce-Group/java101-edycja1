package w2.zadania.hjxxzk;
import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszy bok: ");
        int a = scanner.nextInt();

        System.out.println("Podaj drugi bok: ");
        int b = scanner.nextInt();

        System.out.println("Podaj trzeci bok: ");
        int c = scanner.nextInt();


        System.out.println("Podane boki to: " + a + ", " + b + ", " + c);

        if((a + b > c) && (a + c > b) && (c + b > a)) {
            System.out.println("Z podanych odcinków da sie zbudować trójkąt.");

            if ((a != b) && (b != c) && (c != a)) {

                System.out.println("Trójkąt ten będzie różnoboczny.");

            } else if((a == b) && (a == c) && (b == c))	{

                System.out.println("Trójkąt ten będzie równoboczny.");

            } else	{

                System.out.println("Trójkąt ten będzie równoramienny ");

            }

        } else {

            System.out.println("Z podanych odcinków nie da sie zbudować trójkąta.");

        }
    }
}

