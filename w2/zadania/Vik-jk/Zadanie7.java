import java.util.Scanner;
public class Zadanie7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,licznik=0;
        float suma=0;
        do{
            n=scanner.nextInt();
            suma +=n;
            licznik++;
        }while(n<=100);
        System.out.println(suma/licznik);
    }
}
