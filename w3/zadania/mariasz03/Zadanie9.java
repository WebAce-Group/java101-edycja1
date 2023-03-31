import java.util.Scanner;
public class Zadanie9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        
        for(int i = 0; i<10; i++){
            System.out.println("Podaj " + (i+1) +" liczbe");
            tab[i] = scanner.nextInt();
        }
        int n = 0;
        for(int i : tab){
            System.out.println(Math.pow(i, n));
            n++;
        }

    }
}