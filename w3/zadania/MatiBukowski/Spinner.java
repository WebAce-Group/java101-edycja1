package w3.zadania.MatiBukowski;

import java.util.Scanner;

public class Spinner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        System.out.print("Wpisz tekst: ");
        text = scanner.nextLine();
        SpinWords(text);
    }
    public static void SpinWords(String text) {
        String[] words = text.split(" ");
        int amount = words.length;

        char a;
        int length;

        for(int i=0; i<amount; i++) {
            length = words[i].length();
            char[] tab = new char[length];

            if(length>=5) {
                for(int j=0; j<length; j++) {
                    tab[j] = words[i].charAt(j);
                }
                for(int g=length-1; g>=0; g--) {
                    System.out.print(tab[g]);
                }
                System.out.print(" ");
            }
            else System.out.print(words[i] + " ");
        }
    }

}
