import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        int k, l, m;
Scanner scanner= new Scanner(System.in);
    System.out.println("Podaj pierwsza dlugosc:");
    k=scanner.nextInt();
    System.out.println("Podaj druga dlugosc:");
    l=scanner.nextInt();
    System.out.println("Podaj trzecia dlugosc:");
    m=scanner.nextInt();


    if(k>0 && l>0 && m>0)
    {
       if(k+l>m && k+m>l && l+m>k)
       {
           if(k==l && l==m)
          {
                System.out.println("Mozna zbudowac trojkat rownoboczny ");
          }
          else if(k==l || k==m || l==m)
          {
                System.out.println("Mozna zbudowac trojkat rownoramienny");
          }
          else 
          {
                System.out.println("Mozna zbudowac trojkat roznoboczny");
          }
        
       }
       else
       {
        System.out.println("Nie da sie zbudowac trojkata");
       }
    }
    else
       {
           System.out.println("Nie da sie zbudowac trojkata");
       }


    }
}