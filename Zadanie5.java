import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();
        //petla wyswietlajaca numery od 1 do n
        System.out.println("Liczby od 1 do n");
        for(int i=1; i<=n;i++){
            System.out.println(i +" ");
        }
        System.out.println("Liczby od n do 1");
        for(int i=n; i>=1;i--){
            System.out.println(i +" ");
        }

        System.out.println("Liczby od 1 do n podzielne przez 3 lub 5");
        for(int i=1; i<=n;i++){
           if(i%3==0 || i%5==0) {
               System.out.println(i);
           }
        }

        System.out.println("Liczby od 1 do n podzielne przez 3 lub 5, ale nie sa podzielne przez te liczby jednoczesnie");
        for(int i=1; i<=n;i++){
            if(i%3==0 && i%5==0 && i%15!=0) {
                System.out.println(i);
            }
        }
    }
    //rozwiazania do zadan 6-8 podesle jutro, nie zdazylem ich wykonac
}
