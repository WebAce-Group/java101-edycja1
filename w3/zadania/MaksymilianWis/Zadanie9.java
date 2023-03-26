package w3.zadania.MaksymilianWis;

import java.util.Scanner;

public class Zadanie9 {
    class metody{
        public static void tablica()
        {
            int[] tab = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            tab[i] = scan.nextInt();
            scan.nextLine();
        }
        scan.close();

        for(int x : tab)
        {
            System.out.println(x);
        }
        }
    };

    public static void main(String[] args){
        metody.tablica();
}
}