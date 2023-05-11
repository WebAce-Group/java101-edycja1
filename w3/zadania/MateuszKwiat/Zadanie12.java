import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp;
        ArrayList<String> arrList = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            temp = scanner.nextLine();
            arrList.add(temp);
        }

        Collections.sort(arrList);
        arrList.remove(0);
        for (String x : arrList) {
            System.out.println(x);
        }

    }
}
