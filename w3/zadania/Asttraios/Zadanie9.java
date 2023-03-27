import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie9{

     public static void main(String[] args) {
        
        //tablica 10 elementow

        int[]tablica=new int[10];
        Scanner element=new Scanner(System.in);     //nowy skaner

        System.out.println("Podaj elementy tablicy po kolei: ");
        for(int i=0; i<10; i++)
        {
            tablica[i]=element.nextInt();   //wpisanie elementu do tablicy

        }
        element.close();
        System.out.println("-----------------");

            int indeks=0;       //zmienna pomocnicza indeks
        for(int num : tablica){         //petla for each wyswietlajaca kazdy element po kolei
            System.out.println(pow(num, indeks));   //podniesienie elementu do potegi rownej jej indeksowi
            indeks++;       //indeks nastepnego eleemntu w tablicy
        }
    }
}