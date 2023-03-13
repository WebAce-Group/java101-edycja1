import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] arg){
        boolean czyNieZero=true;
        Scanner liczba=new Scanner(System.in);
        int suma=0;

        System.out.println("Podawaj liczby: ");

        while(czyNieZero){
            int n= liczba.nextInt();
            suma=suma+n;
            if(n==0)
                czyNieZero=false;
        }
        System.out.println("Suma liczb wynosi: "+suma);
    }
}
