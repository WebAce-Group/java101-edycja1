import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        // deklaracja zmiennej miesiac oraz wprowadzenie jej wartosci
        Scanner scanner = new Scanner(System.in);
     System.out.println("Wprowadz liczbe miesiaca (od 1 do 12)");
     int miesiac = scanner.nextInt();
// Za pomoca instrukcji switch wybieramy numer miesiaca i otrzymujemy informacje z ktorego jest kwartalu
     switch(miesiac){
         case 1,2,3:
             System.out.println("1. kwartal");
             break;
             case 4,5,6:
                 System.out.println("2. kwartal");
                 break;
         case 7,8,9:
         System.out.println("3. kwartal");
         break;
         case 10,11,12:
             System.out.println("4. kwartal");
             break;
         default:
             System.out.println("ERROR. Wprowadziles liczbe spoza zakresu.");
     }
     //deklaracja zmiennej dzien tygodnia i wprowadzenie jej do systemu
        System.out.println("Podaj numer od 1 do 7");
        int dzienTygodnia = scanner.nextInt();
     String wynik = switch(dzienTygodnia){
         case 1 -> "Ponidzialek";
         case 2 -> "Wtorek";
         case 3 -> "Sroda";
         case 4 -> "Czwartek";
         case 5 -> "Piatek";
         case 6 -> "Sobota";
         case 7 -> "Niedziela";
         default -> "Wprowadzony dzien tygodnia jest zly";
     };
     System.out.println(wynik);



    }
}
