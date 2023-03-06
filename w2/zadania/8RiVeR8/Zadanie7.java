import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        int suma=0, n, ile=0;

        System.out.println("Podawaj liczby");

        do{
            n=scanner.nextInt();
            suma+=n;
            ile++;
        }while(n<=100);

        System.out.println("Średnia arytmetyczna liczb wynosi: "+(suma/ile));
    }
}
