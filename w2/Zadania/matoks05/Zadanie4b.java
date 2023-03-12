import java.util.Scanner;
public class Zadanie4b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nr tygodnia: ");
        String nr_tygodnia = scan.nextLine();
         String zamiana = switch(nr_tygodnia){
             case "1":
                yield "Poniedzialek";
             case "2":
                yield "Wtorek";
             case "3":
                 yield "Sroda";
             case "4":
                 yield "Czwartek";
             case "5":
                 yield "Piatek";
             case "6":
                 yield "Sobota";
             case "7":
                 yield "Niedziela";
             default:
                 yield "Nie ma takiego dnia tygodnia: ";
         };
         System.out.println(zamiana);
    }
}
