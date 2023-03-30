import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args) {
        boolean s = true;
        double x=0;
        double z=0;
        int c=0;
        System.out.println("podaj liczbe wieksza od 100 ");
        while (s) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            if (a <= 100) {
                System.out.println("podana liczba jest mniejsza lub = 100 ");
                x += a;
                c++;
                z=x/c;
                System.out.println("srednia arytmetyczna wczesniej podanych liczb =  " + z);
                System.out.println("podaj liczbe wieksza od 100 ");
            } else {
                System.out.println("liczba podana jest wieksza od 100  ");
                System.out.println("srednia arytmetyczna wczesniej podanych liczb =  " + z);
            }

        }
    }
}