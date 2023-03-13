package w2.zadania.mmarkowski321;
import java.util.Scanner;
public class zadanie4_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe całkowitą: ");
        int miesiac = scanner.nextInt();
        String kwartal = switch (miesiac){
            case 1,2,3 -> "I kwartał";

            case 4,5,6 -> "II kwartał";

            case 7,8,9 -> "III kwartał";

            case 10,11,12 -> "IV kwartał";

            default -> "Poza zakresem";

        };
        System.out.println(kwartal);
    }
}
