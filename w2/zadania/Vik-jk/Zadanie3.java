import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args){
        System.out.println("podaj dlugosci bokow trojkata: ");
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a<b+c && b<a+c && c<a+b){
            if(a==b && a==c){
            System.out.println("trojkat jest rownoboczny");      
        }else if(a==b || a==c || b==c){
            System.out.println("trojkat jest rownoramienny");
        }else{
            System.out.println("trojkat jest roznoboczny");
        }
    }else
        System.out.println("trojkat nie moze zostac utworzony");

}
}
