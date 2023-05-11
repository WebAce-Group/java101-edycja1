import java.util.Arrays;
import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args){
        int tab[] = new int[10];
        Arrays.fill(tab, 0);
        int tab2[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++){
            tab2[i] = scanner.nextInt();
        }
        Arrays.sort(tab2);
        System.out.println(Arrays.toString(tab2));
    }
}
