import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        double suma = 0;

        int n,  i =0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            suma +=b;
            n=b;
            i++;

        }while(n<=100);

        System.out.println(suma/i);
    }
}
