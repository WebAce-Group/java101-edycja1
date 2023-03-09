package w2.zadania.TheSuspect9702;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        do {
            System.out.println("Prosze podac liczbe mniejsza od 100: ");
            arr.add(scan.nextInt());
        }while(arr.get(arr.size()-1) < 100);
        for (Integer a : arr)
            sum += a;
        System.out.println("Srednia arytmetyczna wynosi: " + (sum/arr.size()));
    }
}
