package w3.zadania.Nurek54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj imię: ");
            String imie = scanner.nextLine();
            lista.add(imie);
        }

        Collections.sort(lista);

        lista.remove(0);

        for (String imie : lista) {
            System.out.println(imie);
        }
    }
}