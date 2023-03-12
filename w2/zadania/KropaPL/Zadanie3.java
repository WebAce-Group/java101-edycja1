import java.util.Scanner;

//    Napisz program, który pobierze od użytkownika 3 całkowite boki trójkąta i sprawdzi,
//    czy da się z nich zbudować trójkąt. Jeśli da się, to program powinien sprawdzić,
//    czy trójkąt jest równoboczny, równoramienny czy różnoboczny. W przypadku,
//    gdy trójkąt nie da się zbudować, program powinien wyświetlić odpowiedni komunikat.

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Test na istnienie trójkąta");
        double[] boki = new double[3];
        for (int i = 0; i < boki.length; i++){
            System.out.println("Wprowadź " + (i+1) + ". bok: ");
            boki [i] = scan.nextDouble();
        }
        boolean test = trojkat(boki[0], boki[1], boki[2]);
        System.out.println("Wynik testu to: " + test);
        if (test) {
            System.out.println("Trójkąt jest: " + typ(boki[0], boki[1], boki[2]));
        } else {
            System.out.println("Z tych odcinków nie da się zbudować trójkąta");
        }
    }

    private static boolean trojkat(double a, double b, double c) {
        boolean test = false;
        if (a >= b && a >= c && (a < b + c)) {
            test = true;
        } else if (b >= a && b >= c && (b < a + c)) {
            test = true;
        } else if (c >= a && c >= b && (c < a + b)) {
            test = true;
        }
        return test;
    }

    private static String typ(double a, double b, double c){
        if (a == b && a == c ) {
            return "równoboczny";
        } else if ((a == b && a != c) || (b == c && b != a)) {
            return "równoramienny";
        } else {
            return "różnoramienny";
        }
    }
}