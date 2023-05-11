import java.util.Scanner;
public class Zadanie4_1 {
    public static void main(String[] args) {
        int x;
        System.out.println("Podaj liczbę z zakresu 1-12:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        switch(x){
            case 1, 2, 3 -> System.out.println("Pierwszy kwartał");
            case 4, 5, 6 -> System.out.println("Drugi kwartał");
            case 7, 8, 9 -> System.out.println("Trzeci kwartał");
            case 10, 11, 12 -> System.out.println("Czwarty kwartał");
            default -> System.out.println("Miało być z zakresu 1-12 debilu!!!!");
        }
    }
}
