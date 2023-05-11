import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;

        do {
            int a = text.nextInt();
            numbers ++;
            sum += a;
            if(a > 100){
                System.out.println("srednia arytmetyczna: " + (sum/numbers));
                break;
            }
        }while (true);
    }
}
