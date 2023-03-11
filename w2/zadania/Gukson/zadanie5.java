import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner userInterface = new Scanner(System.in);
        int n = userInterface.nextInt();
        for(int x = 1;x<=n;x++){
            System.out.println("x = " + x);
        }for(int x = n;x>=1;x--){
            System.out.println("x = " + x);
        }for(int x = n;x>=1;x--){
            if(n%3 == 0 || n%5 == 0){
                System.out.println("x = " + x);
            }
        }for(int x = n;x>=1;x--){
            if((n%3 == 0 && n%5 != 0) || (n%5 == 0 && n%3!=0)){
                System.out.println("x = " + x);
            }
        }
    }
}