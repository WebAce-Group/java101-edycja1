import java.util.Scanner;
import java.util.Scanner;

public class Zadanie9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] Tab = new int[10];
        System.out.println("Podaj 10 liczb");
        for(int i=0;i<10;i++){
            Tab[i]=scanner.nextInt();
        }
        System.out.println("--------------------------------");
        int index = 0;
        for (int i : Tab) {
            System.out.println((int)Math.pow(i,index));
            index++;
        }
    }
}