import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Podaj po kolei boki: a, b, c trójkąta");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            scanner.nextLine();
            if (a + b > c || b + c > a || c + a > b) {
                if (a == b || b == c || a == c) {
                    if (a == b && b == c) {
                        System.out.println("Podany trójkąt jest równoboczny\n");
                    }
                    else System.out.println("Podany trójkąt jest równoramienny\n");
                }
                else System.out.println("Podany trójkąt jest różnoboczny \n");
            }
            else System.out.println("Z tych boków nie da się skonstruować trójkąta");

            while (true) {
                char restart;
                System.out.println("Czy chcesz podać nowe boki? [Y]tak [N]nie");
                restart = scanner.next().charAt(0);
                if (restart == 'Y'|| restart=='y') {
                    break;
                } else if (restart == 'N' || restart=='n') {
                    System.out.println("Kończę program");
                    System.exit(0);
                }
                else System.out.println("Wybierz jedną z opcji");
            }


        }

    }

}
