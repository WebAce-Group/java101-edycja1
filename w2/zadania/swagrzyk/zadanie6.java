import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {


        boolean s = true;
        int x=0;
        System.out.println("podaj liczbe ");
        while (s) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            if (a != 0) {
                System.out.println("podaj liczbe jeszcze raz ");
                x += a;
                System.out.println("suma wczesniej podanych liczb =  " + x);

            } else {
                System.out.println("suma wczesniej podanych liczb =  " + x + " zanim osiagnales zero ");
                System.out.println("liczba jest = 0 program konczy dzialanie  ");
            }

        }
    }
}