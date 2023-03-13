import java.util.Scanner;

class Zadanie5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

        System.out.println("\n\n=================\n");

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("\n\n=================\n");

        for(int i = 1; i <= n; i++){
            if(i % 3 ==0 || i % 5 == 0){
                System.out.println(i);
            }
        }

        System.out.println("\n\n=================\n");

        for(int i = 1; i <= n; i++){
            if((i % 3 ==0 || i % 5 == 0) && i % 15 != 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}