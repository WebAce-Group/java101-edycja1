import java.util.Arrays;
import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] tab0 = new int[10];
        Arrays.fill(tab0, 0);
        int[] tab1 = new int[10];
        for(int i = 0; i<10; i++){
            System.out.println("Podaj " + (i+1) +" liczbe");
            tab1[i] = scanner.nextInt();
        }
        System.out.println("\ntab0 : Przed sortowaniem: ");
        for(int i = 0; i<10; i++){
            System.out.print(tab0[i] + " ");
        }
        System.out.println("\ntab1 : Przed sortowaniem: ");
        for(int i = 0; i<10; i++){
            System.out.print(tab1[i] + " ");
        }
        Arrays.sort(tab0);
        Arrays.sort(tab1);

        System.out.println("\ntab0 :Po sortowaniu: ");
        for(int i = 0; i<10; i++){
            System.out.print(tab0[i] + " ");
        }
        System.out.println("\ntab1 : Po sortowaniu: ");
        for(int i = 0; i<10; i++){
            System.out.print(tab1[i] + " ");
        }
    }
}
