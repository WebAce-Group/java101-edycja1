package w2.Zadania.andrzejk00;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita od 1 do 12");
        int value = scanner.nextInt();
        switch (value){
            case 1,2,3:
                System.out.println("I kwartal");
                break;
            case 4,5,6:
                System.out.println("II kwartal");
                break;
            case 7,8,9:
                System.out.println("III kwartal");
                break;
            case 10,11,12:
                System.out.println("IV kwartal");
                break;
            default:
                System.out.println("liczba spoza zakresu");
                break;
        }

        System.out.println("Podaj liczbe calkowita od 1 do 7");
        int value2 = scanner.nextInt();
        switch (value2){
            case 1 -> System.out.println("poniedziałek");
            case 2 -> System.out.println("wtorek");
            case 3 -> System.out.println("sroda");
            case 4 -> System.out.println("czwartek");
            case 5 -> System.out.println("piatek");
            case 6 -> System.out.println("sobota");
            case 7 -> System.out.println("niedziela");
            default -> System.out.println("liczba spoza zakresu");
        }
    }


}
