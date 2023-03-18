package w3.zadania.TheSuspect9702;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<10; i++) {
            System.out.print("Prosze podac imie: ");
            names.add(scan.nextLine());
        }
        Collections.sort(names);
        names.remove(0);
        for (String a : names) {
            System.out.print(a + " ");
        }
    }
}
