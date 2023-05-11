import java.util.Scanner;

class Zadanie6{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        int sum = 0;
        int k = scanner.nextInt();

        while(bool && k != 0){
            sum += k;
            k = scanner.nextInt();
        }

        System.out.println("Suma: " + sum);

        scanner.close();
    }
}