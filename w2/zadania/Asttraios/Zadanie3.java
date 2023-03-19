
import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie3{

    public static void main(String [] args) {
        int a, b, c;

      Scanner input = new Scanner(System.in);
      System.out.println("Podaj pierwszy bok trojkata: ");
       a=input.nextInt();
       System.out.println("Podaj drugi bok: ");
       b=input.nextInt();
       System.out.println("Podaj trzeci bok: ");
       c=input.nextInt();
      
       input.close();
      
       if((a+b)>c&&(a+c)>b&&(b+c)>a)
      {
        if(a==b&&a==c) System.out.println("Trojkat jest rownoramienny");
        else
        if(pow(a, 2)+pow(b, 2)==pow(c, 2)||pow(a, 2)+pow(c, 2)==pow(b, 2)||pow(b, 2)+pow(c, 2)==pow(a, 2))
        System.out.println("Trojkat jest prostokatny");
        else System.out.println("Trojkat jest roznoramienny");
      }
      else System.out.println("Nie mozna zudowac trojkata!");
        
    }

}