package w2.Zadania.d9one;
import java.util.Scanner;
import static java.lang.Math.*;

public class Zad3 {
    public static void main(String[] args){
        float x, y, z;
        boolean trojkat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 bok trojkata: ");
        x = scanner.nextFloat();
        System.out.println("Podaj 2 bok trojkata: ");
        y = scanner.nextFloat();
        System.out.println("Podaj 3 bok trojkata: ");
        z = scanner.nextFloat();
        if( (abs(y-z)<x) && (x<y+z) )
            trojkat = true;
        else
            trojkat = false;
        System.out.println("Trojkat mozna utworzyc: " + trojkat);
        if( trojkat==true){
            if(x==y && y==z)
                System.out.println("Trojkat jest rownoboczny");
            if( (x+y+z)%3!=0 && (x==z || x==y || z==y) )
                System.out.println("Trojkat jest rownoramienny");
            else if( x!=z && z!=y && x!=y)
                System.out.println("Trojkat jest roznoboczny");
        }
    }
}
