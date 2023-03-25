import java.util.Scanner;



public class Zadanie4 {
    
    public static void main(String[] args) {

        Scanner input2 = new Scanner(System.in);
        int a, b;

        System.out.println("Podaj liczbe: ");
        a=input2.nextInt();

        switch (a) {
            case 1, 2, 3:
            System.out.println("I kwartal- wiosna");
                
                break;
            case 4, 5, 6:
            System.out.println("II kwartal- lato");
                break;
            case 7,8,9:
            System.out.println("III kwartal- jesien");
                break;
            case 10,11,12:
            System.out.println("IV kwartal- zima");
                break; 
        
            default:
            System.out.println("Blad- zakres nie miesci sie od 1 do 12");
                break;
        }

        System.out.println("------SWITCH EXPRESSION------");
        
        System.out.println("Podaj liczbe: ");
        b=input2.nextInt();
        input2.close();

        String wynik=switch (b) {
            case 1 ->"Poniedzialek";
            case 2-> "Wtorek";
            case 3-> "Sroda";
            case 4-> " Czwartek";
            case 5-> "Piatek i humor gituwa B-)";
            case 6-> " Sobota";
            case 7 -> "Niedziela";
            default -> "Blad. Liczba po za zakresem";
        };
        System.out.println(wynik);
    }

    }

