import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
    int mies,tydz;
    Scanner scanner= new Scanner(System.in);
    System.out.println("Podaj numer miesiaca:");
    mies=scanner.nextInt();

    switch(mies)
    {
        case 1,2,3 -> System.out.println("Pierwszy kwartal");
        case 4,5,6 -> System.out.println("Drugi kwartal");
        case 7,8,9 -> System.out.println("Trzeci kwartal");
        case 10,11,12 -> System.out.println("Czwarty kwartal");
        default -> System.out.println("Wpisana liczba nie odpowiada zadnemu miesiacu");

    }
    System.out.println("Podaj dzien tygodnia");
    tydz=scanner.nextInt();
    String outcome=switch(tydz){
       case 1:
       yield "Poniedzialek";
       case 2:
       yield "Wtorek";
       case 3:
       yield "Sroda";
       case 4:
       yield "Czwartek";
       case 5:
       yield "Piatek";
       case 6:
       yield "Sobota";
       case 7: 
       yield "Niedziela";
       default:
       yield "Podany numer nie odpowiada zadnemu z dni tygodnia";
      };
    System.out.println(outcome);  

}
}