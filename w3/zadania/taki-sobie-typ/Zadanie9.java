import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int licznik = 0;
        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            System.out.print("Podaj liczbe:");
            arr[i] = scanner.nextInt();

            arr[i] = (int) Math.pow(arr[i], licznik);
            licznik++;
        }

        for(int element : arr){
            System.out.print(element + ", ");
        }

    }
}