import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj bok a: ");
        a = scanner.nextInt();
        System.out.println("Podaj bok b: ");
        b = scanner.nextInt();
        System.out.println("Podaj bok c: ");
        c = scanner.nextInt();

        if(a+b>c && a+c>b && c+b>a){
            System.out.println("Istnieje!\n");
            if(a==b && c==a){
                System.out.println("Jest rownoboczny");
            }
            else if(a==b || c==a || b==c){
                System.out.println("Jest rownoramienny");
            }
            else {
                System.out.println("Jest roznoboczny");
            }
        }
        else{
            System.out.println("Nie da sie zbudowac!");
        }

    }
}
