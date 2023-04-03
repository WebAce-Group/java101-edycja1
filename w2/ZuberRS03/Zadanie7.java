import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {
        int n;
        int suma = 0;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Podaj liczbę: ");
            n = sc.nextInt();
            suma = suma + n;
            x++;
        }while(n <= 100);
        float srednia = (float)suma/x;
        System.out.println("Średnia podanych liczb: " + srednia);
    }
}
