import java.util.Scanner;

class Zadanie3{

    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a: ");
        a = scanner.nextInt();
        System.out.println("Podaj bok b: ");
        b = scanner.nextInt();
        System.out.println("Podaj bok c: ");
        c = scanner.nextInt();

        if(a + b > c && b + c > a && a + c > b){
            if(a == b && b == c){
                System.out.println("Równoboczny trójkąt, essa 😎");
            }
            else if(a == b || a == c || b == c){
                System.out.println("Trójkąt równoramienny, mniej fajnie");
            }
            else{
                System.out.println("Trójkąt różnoboczny, najgorzej");
            }
        }
        else{
            System.out.println("Nie da się zbudować trójkącika :(");
        }

        scanner.close();
    }
}