import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float suma = 0, counter = 0,l;
        float srednia;
        System.out.println("Podawaj liczby ktore chcesz zsumowac (liczba wieksza od 100 konczy program)");
        do {
            l = scanner.nextInt();
            suma += l;
            counter++;
        }while(l <= 100);
        srednia = suma/counter;
        System.out.println(srednia);
    }
}
