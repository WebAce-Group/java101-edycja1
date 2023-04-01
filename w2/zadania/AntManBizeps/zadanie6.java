import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 1;

        while(number != 0){
            System.out.println("Podaj liczbę, wprowadzenie liczby 0 kończy program: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Suma wprowadzonych liczb: " + sum);

    }

}
