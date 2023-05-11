import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Liczba zero wychodzi z programu");
        int suma=0;
        int n;
        boolean buu =true;
        while (buu) {
            n = scanner.nextInt();
            if(n == 0) buu= false;
            suma+=n;
            
        }
        System.out.print("Suma podanych liczb to: "+suma);

    }

}
