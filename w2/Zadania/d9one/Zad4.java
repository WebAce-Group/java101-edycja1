package w2.Zadania.d9one;
import java.util.Scanner;
public class Zad4 {
    public static void main(String[] args){
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        x = scanner.nextInt();
        switch(x){
            case 1:
                System.out.println("Kwartal pierwszy");
                break;
            case 2:
                System.out.println("Kwartal pierwszy");
                break;
            case 3:
                System.out.println("Kwartal pierwszy");
                break;
            case 4:
                System.out.println("Kwartal drugi");
                break;
            case 5:
                System.out.println("Kwartal drugi");
                break;
            case 6:
                System.out.println("Kwartal drugi");
                break;
            case 7:
                System.out.println("Kwartal trzeci");
                break;
            case 8:
                System.out.println("Kwartal trzeci");
                break;
            case 9:
                System.out.println("Kwartal trzeci");
                break;
            case 10:
                System.out.println("Kwartal czwarty");
                break;
            case 11:
                System.out.println("Kwartal czwarty");
                break;
            case 12:
                System.out.println("Kwartal czwarty");
                break;
            default:
                System.out.println("Podales zla liczbe");
                break;
        }
    }
}
