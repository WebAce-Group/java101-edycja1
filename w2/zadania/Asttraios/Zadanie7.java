import java.util.Scanner;


public class Zadanie7 {
    public static void main(String [] args) {
         
        Scanner input5= new Scanner(System.in);
        int b;

        do{
                System.out.println("Podaj liczbe calkowita: ");
                 b=input5.nextInt();
                

        }while(b<=100);
        input5.close();

    }
}
