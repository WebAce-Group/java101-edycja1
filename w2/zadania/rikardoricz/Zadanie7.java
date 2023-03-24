import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double num, sum = 0, counter = 0, avg;

       do {
           counter++;
           num = scanner.nextInt();
           sum += num;
//           System.out.println(counter + " " + sum);
       } while (num <= 100);
       avg = (double) (sum / counter);

       System.out.println("Srednia: " + avg);
    }
}
