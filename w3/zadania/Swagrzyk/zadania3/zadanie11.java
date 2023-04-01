import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class zadanie11 {
    public static void main(String[] args) {


        int[] tablica=new int [10];
        Arrays.fill(tablica, 0);
        int[] tab_x=new int [10];
        Random liczba = new Random();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10;i++){
            int los = liczba.nextInt(101);
            tablica[i]=los;
        }

        for(int i=0; i<10;i++){
            int b=i+1;
            System.out.println("Podaj liczbe :"+b);

            tab_x[i]= scanner.nextInt();
        }
        Arrays.sort(tablica);
        Arrays.sort(tab_x);


        for (int j : tablica) {
            System.out.println(j);
        }
        System.out.println();

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tab_x[i]);
        }

    }
}
