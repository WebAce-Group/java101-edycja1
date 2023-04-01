import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        forward(number);
        backward(number);
        dividedByBoth(number);
        divedByOne(number);

    }

    static void forward(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        System.out.println("__________________");
    }

    static void backward(int n){
        for(; n>0; n--){
            System.out.println(n);
        }
        System.out.println("__________________");
    }

    static void dividedByBoth(int n){
        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            } else continue;
        }
        System.out.println("__________________");
    }

    static void divedByOne(int n){
        for(int i=1; i<=n; i++){
            if(i%15==0) continue;
            else if(i%3==0) System.out.println(i);
            else if(i%5==0) System.out.println(i);
            else continue;
        }
        System.out.println("__________________");
    }
}
