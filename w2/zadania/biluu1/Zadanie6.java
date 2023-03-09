import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args){
        boolean n=true;
        int b=0;
        while (n){
            System.out.println("Podaj liczbe calkowita");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a!=0){
                b+=a;
            }else n=false;
            System.out.println("Suma podanych liczb: " +b);
        }
    }
}
