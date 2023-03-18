package w3.zadania.TheSuspect9702;

import java.util.Scanner;

public class Spinner {
    public String[] SpinWords(String[] arr) {
        char reverser;
        String[] arr1 = new String[arr.length];
        for (int j = 0; j < arr.length; j++){
            if (arr[j].length() >= 5) {
                for (int i = 0; i < arr[j].length(); i++) {
                    reverser = arr[j].charAt(i);
                    if (arr1[j] == null)
                        arr1[j] = String.valueOf(reverser);
                    else
                        arr1[j] = reverser + arr1[j];
                }
            }
            else
                arr1[j] = arr[j];
        }
        return arr1;
    }
    public static void main(String[] args) {
        String toSpin;
        Scanner scan = new Scanner(System.in);
        System.out.println("Prosze podać zdanie:");
        toSpin = scan.nextLine();
        String[] arr;
        arr = toSpin.split(" ");
        Spinner spinner = new Spinner();
        for(String a : spinner.SpinWords(arr))
            System.out.print(a + " ");
    }
}
