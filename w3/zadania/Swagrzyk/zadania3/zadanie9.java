import java.util.Scanner;
public class zadanie9 {
    public static void main(String[] args) {
        int[] tablica=new int [10];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<10;i++){
            int a=i+1;
            System.out.println("Podaj liczbe :"+a);

            tablica[i]= scanner.nextInt();
        }
        for (int i =0;i< tablica.length;i++){
            int potega_liczby = 1;

            for(int k=0;k<i;k++) {
                potega_liczby *= tablica[i];

            }

            System.out.println("liczba z indeksu nr " + i + "to liczba ktora podales czyli "+tablica[i]+"podniesiona do potegi ="+i+"wynik to " + potega_liczby);

        }
    }
}