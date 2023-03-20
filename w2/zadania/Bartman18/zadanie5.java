import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args){
        System.out.println("Podaj liczbe n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("liczby od 1 do n");
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }

        System.out.println("liczby od n do 1");
        for(int i = n; i>=1;i--){
            System.out.println(i);
        }

        System.out.println("liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5");
        for (int i= 1; i<=n;i++){
            if((i % 5 == 0) || (i % 3 == 0)){
                System.out.println(i);

            }
        }
        System.out.println("liczby od 1 do n, ale tylko te, które są podzielne przez 3 lub 5, ale nie jednocześnie przez oba");
        for (int i= 1; i<=n;i++){
            if((i % 5 == 0 && i % 3 !=0)||(i % 5 != 0 && i % 3 ==0)){
                System.out.println(i);

            }
        }

    }
}
