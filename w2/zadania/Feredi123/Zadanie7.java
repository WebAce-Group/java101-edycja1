import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        double srednia = 0;
        int i = 0;
        boolean bool = true;

        do {
            i++;
            n = scanner.nextInt();
            srednia = (srednia * (i-1)  + n)/i;
            System.out.println(srednia);
            if(n > 100){
                bool = false;
            }
        } while(bool);


    }
}
