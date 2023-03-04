import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean zmienna = true;
        int suma = 0;
        while (zmienna){
            System.out.println("Podajliczbe calkowta do dodania (aby zakonczyc wpisz 0)");
            int n = scanner.nextInt();
            suma += n;
            if (n == 0)
                zmienna = false;
        }
        scanner.close();
        System.out.println(suma);
    }
}