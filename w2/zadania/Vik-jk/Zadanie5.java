import java.util.Scanner;
public class Zadanie5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj n: ");
        int n= scanner.nextInt();
        System.out.println("pierwsza petla: \n");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        System.out.println("druga: \n");
        for(int j=n;j>=1;j--){
            System.out.println(j);
        }
        System.out.println("podzielnosc1: \n");
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0)
                System.out.println(i);
        }
        System.out.println("podzielnosc2: \n");
        for(int i=1;i<=n;i++){
            if((i%3==0 || i%5==0)&&i%(3*5)!=0)
                System.out.println(i);
        }
        
    }
}