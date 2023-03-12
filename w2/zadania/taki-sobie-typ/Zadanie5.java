import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita: ");
        n = Math.abs(scanner.nextInt());

        System.out.println("Od 0-n");
        for(int i=0;i<=n;i++){
            System.out.print(i+", ");
        }

        System.out.println("\nOd n-0");
        for(int i=n;i>=0;i--){
            System.out.print(i+", ");
        }

        System.out.println("\nOd n-0 podzielne 3 lub 5");
        for(int i=0;i<=n;i++){
            if(i%3==0 || i%5==0) {
                System.out.print(i+", ");
            }
        }

        System.out.println("\nOd n-0 podzielne 3 lub 5, nie przez obie");
        for(int i=0;i<=n;i++){
            if((i%3==0 || i%5==0) && !(i%3==0 && i%5==0)) {
                System.out.print(i+", ");
            }
        }

    }
}
