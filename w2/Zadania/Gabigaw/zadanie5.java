package org.example;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println( +i);
        }
        System.out.println("------------");
        for(int i=n;i>0;i--){
            System.out.println( +i);
        }
        System.out.println("------------");
        for(int i=1;i<=n;i++){
            if((i%3)==0 || (i%5)==0){
                System.out.println( +i);
            }
        }
        System.out.println("------------");
        for(int i=1;i<=n;i++){
            if((i%3)==0 || (i%5)==0){
                if((i%3)==0 && (i%5)==0){
                    System.out.println( " ");
                } else {
                    System.out.println( +i);
                }
            }
        }
    }
}