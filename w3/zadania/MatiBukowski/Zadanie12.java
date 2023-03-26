package w3.zadania.MatiBukowski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Podaj imiona: " + "\n");
        for(int i=0; i<10; i++) {
            list.add(scanner.next());
        }

        Collections.sort(list);

        list.remove(0);

        for(String x: list)
            System.out.println(x);
    }
}
