import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);


        boolean run = true;
        int sum = 0;

        while (run){
            int a = text.nextInt();
            sum += a;
            if(a == 0){
                break;
            }
        }
        System.out.println("Suma: " + sum);
    }
}
