package w2.zadania.mmarkowski321;
import java.util.Scanner;
public class zadanie4_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita: ");
        int liczba = scanner.nextInt();
        switch (liczba){
            case 1,2,3:
                System.out.println("I kwartał");
                break;
            case 4,5,6:
                System.out.println("II kwartał");
                break;
            case 7,8,9:
                System.out.println("III kwartał");
                break;
            case 10,11,12:
                System.out.println("IV kwartał");
                break;
            default:
                System.out.println("Poza zakresem");
        }


    }
}
