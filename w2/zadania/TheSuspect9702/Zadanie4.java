package w2.zadania.TheSuspect9702;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca: ");
        int wybor = scan.nextInt();
        switch (wybor){
            case 1:
            case 2:
            case 3:
                System.out.println("I Kwartał");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("II Kwartał");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("III Kwartał");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("IV Kwartał");
                break;
            default:
                System.out.println("Podałeś liczbę z poza zakresu 1-12");
                break;
        }
        System.out.print("Podaj numer dnia: ");
        int dzien = scan.nextInt();
        switch (dzien) {
            case 1 -> System.out.println("Poniedziałek");
            case 2 -> System.out.println("Wtorek");
            case 3 -> System.out.println("Sroda");
            case 4 -> System.out.println("Czwartek");
            case 5 -> System.out.println("Piątek");
            case 6 -> System.out.println("Sobota");
            case 7 -> System.out.println("Niedziela");
            default -> System.out.println("Podałeś liczbę z poza zakresu 1-7");
        }
    }
}
