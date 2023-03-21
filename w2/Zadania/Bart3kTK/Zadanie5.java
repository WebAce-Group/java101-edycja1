import java.util.Scanner;


public class Zadanie5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnia liczbe calkowta");
        int n = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i<=n; i++ ) //#1 od 1 do n
            System.out.println(i);

        System.out.println("");

        for (int i = n; i>=1; i-- ) //#2 od n do 1
            System.out.println(i);

            System.out.println("");

        for (int i = 1; i<=n; i++ ){ //#3 od 1 do n podzielne przez 3 lub 5
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println(i);
        }

        System.out.println("");

        for (int i = 1; i<=n; i++ ){ //#4 od 1 do n podzielne przez 3 lub 5 i niepodzielne przez 15
            if ((i % 3 == 0 || i % 5 == 0) && i%15 != 0) 
                System.out.println(i);
        }
    }
}