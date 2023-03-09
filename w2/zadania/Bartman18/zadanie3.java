import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj bok a:");
    int a = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Podaj bok b:");
    int b = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Podaj bok c:");
    int c = scanner.nextInt();
    scanner.nextLine();

    if(a>b && a>c && b+c>a){
        System.out.println("Można stworzyć trójkąt");
    }
    else if(b>a && b>c && a+c> b){
        System.out.println("Można stworzyć trójkąt");
    }
    else if(c>a && c>b && b+a>c){
        System.out.println("Można stworzyć trójkąt");
    }
    else{
        System.out.println("Nie można stworzyć trójkąta");
    }


    }
}