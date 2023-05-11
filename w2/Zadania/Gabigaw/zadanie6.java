package org.example;
import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        boolean x = true;
        Scanner scanner = new Scanner(System.in);
        int w; //w jak wynik
        int z=0;
        while(x== true)
        {
            System.out.println("Podaj liczbę: ");
            int y = scanner.nextInt();
            if(y!=0){
                w=y+z;
                System.out.println("suma liczb: " +w);
                System.out.println( " ");
                z=w;
            } else{
                x= false;
            }
        }
    }
}