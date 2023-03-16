import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args){
        boolean pierwsza = true;
        int suma = 0;

        int n=-1;
        while(n!=0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            suma +=b;
            n=b;


        }

        System.out.println(suma);

    }
}
