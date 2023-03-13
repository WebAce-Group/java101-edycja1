package w2.zadania.TheSuspect9702;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        boolean var = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while(var){
            System.out.print("Prosze podac liczbe numer " + (arr.size()+1) + ": ");
            arr.add(scan.nextInt());
            if(arr.get(arr.size()-1) == 0)
                var = false;
        }
        int suma = 0;
        for (int a : arr)
            suma += a;
        System.out.println("Suma podanych liczb to: " + suma);
    }
}
