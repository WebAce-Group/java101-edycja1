import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        boolean x = true;
        int suma = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        while( x == true){
            System.out.println("Podaj liczbę: ");
            n = sc.nextInt();
            suma = suma + n;
            if(n == 0)
                x = false;
        }
        System.out.println("Suma podanych liczb: " + suma);
    }
}
