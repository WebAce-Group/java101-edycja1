import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args)
    {
        ArrayList<String> t=new ArrayList<String>();
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<10;i++) {
            t.add(scanner.next());
        }

        Collections.sort(t);
        System.out.println("Posortowana:");
        System.out.println(t);
        t.remove(0);
        for (String p: t) {
            System.out.print(p+" ");
        }

    }
}
