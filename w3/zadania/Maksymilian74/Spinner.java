package w3.zadania.Maksymilian74;
import java.util.Scanner;
public class Spinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź zdanie");
        String zdanie = scanner.nextLine();
        SpinWords(zdanie);
    }

    public static void SpinWords(String input) {
        String[] slowa = input.split(" ");
        String tmp="";
        for(String slowo : slowa)
        {
            if(slowo.length()>=5) {
                tmp="";
                for(int i=slowo.length()-1;i>=0;i--)
                    tmp += slowo.charAt(i);
                System.out.print(tmp + " ");
            }
            else
                System.out.print(slowo + " ");
        }
    }
}
