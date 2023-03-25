import java.util.Scanner;
import java.util.Arrays;

public class Zadanie11{
    public static void main(String[] args){
        int[] Tab = new int [10];
        Arrays.fill(Tab, 0);
        int[] Tab2 = new int [10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb:");
        for(int i=0; i<10; i++){
            Tab2[i] = scanner.nextInt();
        }
        Arrays.sort(Tab);
        Arrays.sort(Tab2);
        for(int i : Tab){
           System.out.print(i + " ");
       }
       System.out.println();
       for(int i : Tab2){
           System.out.print(i + " ");
       }
    }
}