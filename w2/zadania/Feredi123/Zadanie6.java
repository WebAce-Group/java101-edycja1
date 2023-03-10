import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n,suma = 0;
        boolean bool = true;

        while(bool){
            n = scanner.nextInt();
            suma += n;
            System.out.println(suma);
            if(n ==0){
                bool = false;
            }
        }


    }
}
