package w3.zadania.hjxxzk1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Zadanie9 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];

        for(int e = 0; e < 10; e++){
            System.out.print("Podaj wartosc : ");
            tab[e] = scanner.nextInt();
        }

        int id = 0;

        for(int i : tab){
            System.out.println("Numer indeksu = " + id);
            System.out.println("Wartosc = " + i);
            System.out.println("Wartosc podniesiona do potegi = " + pow(i,id));
            System.out.println();
            ++id;
        }

    }


}
