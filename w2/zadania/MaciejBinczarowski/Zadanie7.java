import java.util.Scanner;

class Zadanie7{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        int k;
        

        do{
            k = scanner.nextInt();
            sum += k;
            counter++;

        } while(k <= 100);

        System.out.println("Średnia arytmetyczna podanych liczb: " + (double)(sum)/counter);

        scanner.close();
    }
}