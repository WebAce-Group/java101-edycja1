import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        int number;
        int sum=0;
        int count=0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            count++;
            sum += number;
        }while(number>100);

        System.out.println("Średnia podanych liczb: " + sum/count);
    }
    
}
