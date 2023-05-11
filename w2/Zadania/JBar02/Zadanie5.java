package w2.Zadania.JBar02;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int n=0;
        n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("od konca do poczatku");
        for(int i=n;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("podzielne przez 3 lub 5");
        for(int i=1;i<=n;i++){
            if(i%5==0 || i%3==0) System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("podzielne przez 3 lub 5 ale nie przez oba");
        for(int i=1;i<=n;i++){
            if(i % 3 == 0 && i%5!=0 || i % 3 != 0 && i%5==0) {
                System.out.print(i+" ");
            }
        }

    }
}