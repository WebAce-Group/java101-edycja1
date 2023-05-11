package w2.Zadania.JBar02;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int miesiac=0,dzien ;
        System.out.println("Podaj numer miesiąca");
        miesiac=scanner.nextInt();
        switch (miesiac){
            case 1,2,3:{
                System.out.println("1 kwartal");
                break;
            }
            case 4,5,6:{
                System.out.println("2 kwartal");
                break;
            }
            case 7,8,9:{
                System.out.println("3 kwartal");
                break;
            }
            case 10,11,12:{
                System.out.println("4 kwartal");
                break;
            }
            default:
                System.out.println("nie ma takiego kwartalu");
        }
        System.out.println("Podaj dzien tygodnia");
        dzien=scanner.nextInt();
        String wynik= switch (dzien){
            case 1:
                yield "Poniedzialek";
            case 2:
                yield "Wtorek";
            case 3:
                yield "sroda";
            case 4:
                yield "czwartek";
            case 5:
                yield "piatek";
            case 6:
                yield "sobota";
            case 7:
                yield "niedziela";
            default:
                yield "nie ma takiego dnia";
        };
        System.out.println(wynik);
    }
}