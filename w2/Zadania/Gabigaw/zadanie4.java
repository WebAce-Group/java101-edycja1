package org.example;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą (z zakresu 1-12): ");
        int x = scanner.nextInt();

            switch (x){
                case 1:
                    System.out.println("pierwszy kwartał");
                    break;
                case 2:
                    System.out.println("pierwszy kwartał");
                    break;
                case 3:
                    System.out.println("pierwszy kwartał");
                    break;
                case 4:
                    System.out.println("drugi kwartał");
                    break;
                case 5:
                    System.out.println("drugi kwartał");
                    break;
                case 6:
                    System.out.println("drugi kwartał");
                    break;
                case 7:
                    System.out.println("trzeci kwartał");
                    break;
                case 8:
                    System.out.println("trzeci kwartał");
                    break;
                case 9:
                    System.out.println("trzeci kwartał");
                    break;
                case 10:
                    System.out.println("czwarty kwartał");
                    break;
                case 11:
                    System.out.println("czwarty kwartał");
                    break;
                case 12:
                    System.out.println("czwarty kwartał");
                    break;

                default:
                    System.out.println("podana liczba jest poza zakresem!");
            }

        System.out.println("-------------");
        System.out.println("Podaj kolejną liczbę całkowitą (z zakresu 1-7): ");
        //int y = scanner.nextInt();
        String w;
        switch (y){

            case 1 -> w ="poniedziałek";
            case 2 -> w ="wtorek";
            case 3 -> w ="środa";
            case 4 -> w ="czwartek";
            case 5 -> w ="piątek";
            case 6 -> w ="sobota";
            case 7 -> w ="niedziela";
            default -> w ="podana liczba jest poza zakresem";

        }
        System.out.println(w);
    }
}