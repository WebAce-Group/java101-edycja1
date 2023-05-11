import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie9 {
    public static void main(String[] args) {
        int[] Tab = new int[10];
        System.out.println("Podaj 10 liczb do tablicy");
        Scanner scanner = new Scanner(System.in);
        for( int i = 0; i < 10; i++)
        {
            Tab[i] = scanner.nextInt();
        }
        for( int e : Tab)
        {
            System.out.println(pow(e,e));
        }
    }
}