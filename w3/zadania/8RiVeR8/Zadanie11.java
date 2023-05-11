import java.util.Arrays;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        int [] tab = new int[10];
        int [] tab2 = new int[10];
        Arrays.fill(tab, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");
        for(int i=0; i<10; i++)
            tab2[i]=sc.nextInt();

        System.out.println("Przed sortowaniem");
        System.out.print("tab: ");
        for (int x:tab) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("tab2: ");
        for (int x:tab2) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Po sortowaniu");
        Arrays.sort(tab);
        Arrays.sort(tab2);
        System.out.print("tab: ");
        for (int x:tab) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("tab2: ");
        for (int x:tab2) {
            System.out.print(x+" ");
        }
    }
}
