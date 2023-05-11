import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> Tab = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for( int i = 0; i < 10; i++)
        {
            Tab.add(scanner.nextLine());
        }
        //Tab.sort(); <- sortowanie dla stringow pokazuje blad
        Tab.remove(0);
        for( String e : Tab)
        {
            System.out.println(e);
        }
    }
}