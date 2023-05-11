import java.util.Scanner;

public class Zadanie9{

    public static int[] potegaIndexu(int[] tab){
        int[] tabPow = new int[tab.length];
        for (int i = 0; i<tab.length; i++)
            tabPow[i] = (int) Math.pow((double) tab[i], (double) i);
        return tabPow;
    } 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[10];

        for(int i = 0; i<10; i++){
            System.out.print("\nPodaj liczbe: ");
            int n = scanner.nextInt();
            tab[i] = n;
        }


        tab = potegaIndexu(tab);
        
        for (int Element: tab){
            System.out.println(Element);
        }
    }
}