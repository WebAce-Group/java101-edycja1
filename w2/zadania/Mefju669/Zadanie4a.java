import java.util.Scanner;

public class Zadanie4a {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbe 1-12");
        int podanaLiczba=scanner.nextInt();

        switch (podanaLiczba){
            case 1,2,3: System.out.println("1 kwartal");
            break;
            case 4,5,6: System.out.println("2 kwartal");
            break;
            case 7,8,9:System.out.println("3 kwartal");
            break;
            case 10,11,12:System.out.println("4 kwartal");
            break;
            default:System.out.println("Cos podales nie tak.");
            break;
        }


    }
}
