import java.util.Scanner;
public class Zadanie4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();
        scanner.close();

        String kwartal = switch (n) {
            case 1,2,3 -> "I kwartał";
            case 4,5,6 -> "II kwartał";
            case 7,8,9 -> "III kwartał";
            case 10,11,12 -> "IV kwartał";
            default -> "Podaj liczbę z zakresu 1-12";
        };
        System.out.println(kwartal);

    }
}