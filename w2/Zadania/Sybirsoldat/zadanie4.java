import java.util.Scanner;
public class zadanie4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("podaj liczbe z zakresu 1-12");
        a=scanner.nextInt();
        switch(a){
            case 1,2,3:
                System.out.println("kwartal 1");
                break;
            case 4,5,6:
                System.out.println("kwartal 2");
                break;
            case 7,8,9:
                System.out.println("kwartal 3");
                break;
            case 10,11,12:
                System.out.println("kwartal 4");
                break;
            default:
                System.out.println("debil");
                break;
        };
        int b;
        System.out.println("podaj liczbe od 1-7");
        b=scanner.nextInt();
        String dzien=switch(b) {
            case 1:
                yield "pon";
            case 2:
                yield "wt";
            case 3:
                yield "sr";
            case 4:
                yield "czw";
            case 5:
                yield "pt";
            case 6:
                yield "sob";
            case 7:
                yield "nd";
            default:
                yield "debil^2";

        };
        System.out.println(dzien);

    }
}