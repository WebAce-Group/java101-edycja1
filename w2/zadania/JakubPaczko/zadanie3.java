import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Podaj boki trojkata");


        int a = text.nextInt();
        int b = text.nextInt();
        int c = text.nextInt();

        if(a == 0 || b == 0 || c == 0){
            System.out.println("Boki trojkata nie moga byc mniejsze lob rowne zero");
            return;
        }

        if(a + b < c || b + c < a || a + c < b){
            System.out.println("Z podanych bokow nie mozna zrobic trojkata");
            return;
        }
        else{
            System.out.println("Z podanych bokow mozna zrobic trojkat");
        }

        if(a == b & (a | b) != c){
            System.out.println("Trojkat rownoramienny");
        }
        else if(a == b & b == c & c == a){
            System.out.println("Trojkat rownoboczny");

        }
    }

}
