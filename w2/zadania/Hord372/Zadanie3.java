import java.util.Scanner;
public class Zadanie3 {

    public static void main(String[] args) {
        //Sides length
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //Finding the biggest value
        int t = Math.max(a,Math.max(b,c));
        //What is your triangle
        if (t>=(a+b+c-t)){
            System.out.println("You can't build a triangle");
            return;
        }
        if (t==a && t==b && t==c){
            System.out.println("It is a equilateral triangle");
        return;
        }
        if(b==a && c==b || a==c && a==b || c==a && c==b){
            System.out.println("It is a isosceles triangle");
        }
            System.out.println("It is a normal triangle");
    }
}