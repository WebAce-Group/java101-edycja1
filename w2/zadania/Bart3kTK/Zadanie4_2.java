import java.util.Scanner;


public class Zadanie4_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowta od 1 do 7");
        int liczba = scanner.nextInt();
        scanner.close();

        String wynik = switch (liczba) {
            case 1 -> "Poniedzialek" ;
            case 2 -> "Wtorek";
            case 3 -> "Sroda";
            case 4 -> "Czwartek";
            case 5 -> "Piatek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Zle dane wyejsciowe";
        };
        System.out.println(wynik);

        


        //Udalo mi sie pobrac jave 19 i wszystko smiga :D




    }
}