import java.util.Scanner;



public class Zadanie6 {
    public static void main(String [] args) {
        
        int a;
        boolean prawda=true;
        Scanner input4=new Scanner(System.in);

        while(prawda){

            System.out.println("Podaj liczbe calkowita: ");
            a=input4.nextInt();
            
            if(a==0)    prawda=false;

        }
        input4.close();
    }
    
}
