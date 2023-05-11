package w3.zadania.Viborcia;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0;i<10;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imie: ");
            String n=scanner.nextLine();
            lista.add(n);
        }
        sort(lista);
        lista.remove(0);
        System.out.println("Pozostale imiona");
        for (String n : lista) {
            System.out.println(n);
        }
    }
}
