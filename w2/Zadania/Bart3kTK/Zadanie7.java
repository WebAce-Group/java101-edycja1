import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        double ilosc = 0;
        int n = 0;
        do{
            System.out.println("Podajliczbe calkowta");
            n = scanner.nextInt();
            suma += n;
            ilosc += 1;

        } while(n<100);
        scanner.close();
        double srednia = suma/ilosc;
        System.out.println(srednia);
    }
}