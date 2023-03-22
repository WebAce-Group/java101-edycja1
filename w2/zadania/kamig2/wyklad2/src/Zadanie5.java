import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj n:");
        n = scanner.nextInt();
        //liczby od 1 do n
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
        System.out.println();
        //liczby od n do 1
        for (int i=n;i>0;i--){
            System.out.println(i);
        }
        System.out.println();
        //liczby od 1 do n podzielne przez 3 lub 5
        for (int i=1;i<=n;i++){
            if (i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
        System.out.println();
        //liczby od 1 do n podzielne przez 3 lub 5, ale nie jednoczesnie przez oba
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5!=0){
                System.out.println(i);
            }else if (i%5==0 && i%3!=0){
                System.out.println(i);
            }
        }

    }
}
